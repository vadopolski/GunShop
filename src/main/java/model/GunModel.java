package model;

public class GunModel {
    //    id            INT AUTO_INCREMENT PRIMARY KEY,
    private int id;

    //    name          VARCHAR(255) NOT NULL,
    private String name;

    //    license_level INT          NOT NULL,
    private License license;

    //    caliber       FLOAT        NOT NULL,
    private double caliber;

    //    length        FLOAT        NOT NULL,
    private double length;

    //    is_rifled     BOOL         NOT NULL,
    private boolean is_rifled;

    //    capacity      INT          NOT NULL,
    private int capacity;
}
