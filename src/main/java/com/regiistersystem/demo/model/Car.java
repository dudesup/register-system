package com.regiistersystem.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
public class Car {
    private String name;
    private String email;
    private String phone;
    private String model;
    private String vin;
    private BigDecimal purchasePrice;
    private Date purchaseDate;
    private boolean contact;


}
