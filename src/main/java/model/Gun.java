package model;

import java.time.LocalDate;

public class Gun {
    //    id VARCHAR(64) PRIMARY KEY,
    private String id;

    //    model_id INT NOT NULL ,
    private GunModel gunModel;

    //    dob DATE NOT NULL ,
    private LocalDate dob;

    //    is_used BOOL DEFAULT FALSE ,
    private Boolean isUsed;

    //    delivery_date DATE NOT NULL ,
    private LocalDate deliveryDate;

    //    buyer_id INT NULL ,
    private User buyer;
}