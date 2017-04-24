package model;

import com.hegel.orm.annotations.Size;
import lombok.Value;

@Value
public class Address {

    private int id;

    private String street;
    //    street VARCHAR(255) NOT NULL,

//    @Size(64) Очень важно делать валидацию
    private String city;
    //    city   VARCHAR(64),

    private String house;
    //    house  VARCHAR(20)  NOT NULL,

    private int flat;
    //    flat   INT


}
