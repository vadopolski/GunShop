CREATE TABLE Address (
  id     INT AUTO_INCREMENT PRIMARY KEY,
  street VARCHAR(255) NOT NULL,
  city   VARCHAR(64),
  house  VARCHAR(20)  NOT NULL,
  flat   INT
);

CREATE TABLE LicenseLevel (
  level       INT AUTO_INCREMENT PRIMARY KEY,
  name        VARCHAR(128) NOT NULL,
  description VARCHAR(1024)
);

CREATE TABLE User (
  id            INT AUTO_INCREMENT PRIMARY KEY,
  first_name    VARCHAR(64)  NOT NULL,
  last_name     VARCHAR(64)  NOT NULL,
  pathronimic   VARCHAR(255),
  nickname      VARCHAR(64)  NOT NULL,
  dob           DATE,
  address_id    INT,
  license_level INT,
  telephone     VARCHAR(64)  NOT NULL,
  email         VARCHAR(128) NOT NULL,
  password      VARCHAR(256) NOT NULL,

  FOREIGN KEY (address_id) REFERENCES Adress (id),
  FOREIGN KEY (license_level) REFERENCES LicenseLevel (level),
  UNIQUE (nickname),
  UNIQUE (email)
);

CREATE TABLE GunModel (
  id            INT AUTO_INCREMENT PRIMARY KEY,
  name          VARCHAR(255) NOT NULL,
  license_level INT          NOT NULL,
  caliber       FLOAT        NOT NULL,
  length        FLOAT        NOT NULL,
  is_rifled     BOOL         NOT NULL,
  capacity      INT          NOT NULL,

  FOREIGN KEY (license_level) REFERENCES LicenseLevel (level)
);

CREATE TABLE Gun (
  id VARCHAR(64) PRIMARY KEY,
  model_id INT NOT NULL ,
  dob DATE NOT NULL ,
  is_used BOOL DEFAULT FALSE ,
  delivery_date DATE NOT NULL ,
  buyer_id INT NULL ,

  FOREIGN KEY (model_id) REFERENCES GunModel (id),
  FOREIGN KEY (buyer_id) REFERENCES User (id)
);