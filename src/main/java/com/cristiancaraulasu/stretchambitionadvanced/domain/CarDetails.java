package com.cristiancaraulasu.stretchambitionadvanced.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Getter
@Setter
@AllArgsConstructor
@Entity
@IdClass(CarId.class)
public class CarDetails {
// TODO check through test if @Id contains @NotNull
    @Id
    private String brand;
    @Id
    private String model;
    @Id
    private String generation;
    @Id
    private String engine;
    @NonNull
    private int startYear;
    @NonNull
    private int endYear;
    @NonNull


    public CarDetails() {

    }
}
