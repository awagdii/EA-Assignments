package com.ea.week02;

import javax.persistence.*;

@Entity(name = "CarTbl")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Car(String make, String model, Integer year, int miles, Color color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.miles = miles;
        this.color = color;
    }

    private String make;
    private String model;
    @Column(name = "ManufacturingYear")
    private Integer year;
    private int miles;
    @Enumerated(EnumType.STRING)
    private Color color;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
