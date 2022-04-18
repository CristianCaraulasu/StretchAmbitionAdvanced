package com.cristiancaraulasu.stretchambitionadvanced.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class CarId implements Serializable {

    private String brand;
    private String model;
    private String generation;
    private String engine;

}
