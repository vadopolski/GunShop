package model;

import lombok.Value;

import java.util.Date;

@Value
public class User {
    private int id;
    //    id            INT AUTO_INCREMENT PRIMARY KEY,
    private String first_name;
    //    first_name    VARCHAR(64)  NOT NULL,
    private String last_name;
    //    last_name     VARCHAR(64)  NOT NULL,
    private String pathronimic;
    //    pathronimic   VARCHAR(255),
    private String nickname;
    //    nickname      VARCHAR(64)  NOT NULL,
    private Date dob;
    //    dob           DATE,
    private int addressId;
    //    address_id    INT,
    private int licenseLevel;
    //    license_level INT,
    private String telephone;
    //    telephone     VARCHAR(64)  NOT NULL,
    private String email;
    //    email         VARCHAR(128) NOT NULL,
    private String password;
    //    password      VARCHAR(256) NOT NULL,
}