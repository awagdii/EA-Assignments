package com.ea.week04.table.per.concreteclass;

import javax.persistence.*;

@Entity
@Table(name = "table_per_class_laptop")

public class LaptopTpc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "laptop_id")
    private Long id;

    private String model;

    public LaptopTpc(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
