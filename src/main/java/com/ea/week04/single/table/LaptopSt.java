package com.ea.week04.single.table;

import javax.persistence.*;

@Entity
@Table(name = "single_table_laptop")

public class LaptopSt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "laptop_id")
    private Long id;

    private String model;

    public LaptopSt(String model) {
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
