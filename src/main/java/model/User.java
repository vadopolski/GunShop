package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import lombok.experimental.Accessors;

import java.time.LocalDate;

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class User {

    public static String FIRST_NAME_KEY = "firstName";

    //    id            INT AUTO_INCREMENT PRIMARY KEY,
    private int id;

    //    first_name    VARCHAR(64)  NOT NULL,
    private String first_name;

    //    last_name     VARCHAR(64)  NOT NULL,
    private String last_name;

    //    pathronimic   VARCHAR(255),
    private String pathronimic;

    //    nickname      VARCHAR(64)  NOT NULL,
    private String nickname;

    //    dob DATE,
    private LocalDate dob;

    //    address_id    INT,
    private Address address;

    //    license_level INT,
    private License license;

    //    telephone     VARCHAR(64)  NOT NULL,
    private String telephone;

    //    email         VARCHAR(128) NOT NULL,
    private String email;

    //    password      VARCHAR(256) NOT NULL,
    private String passwordHash;
}