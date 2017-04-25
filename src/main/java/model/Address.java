package model;

import lombok.Value;

@Value
public class Address {

    private int id;

    //    street VARCHAR(255) NOT NULL,
    private String street;

    //    city   VARCHAR(64),
    private String city;

    //    house  VARCHAR(20)  NOT NULL,
    private String house;

    //    flat   INT
    private int flat;
}