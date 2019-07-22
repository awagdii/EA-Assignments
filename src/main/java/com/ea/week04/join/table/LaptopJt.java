package com.ea.week04.join.table;

import javax.persistence.*;

@Entity
@Table(name = "join_table_laptop")
public class LaptopJt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "laptop_id")
    private Long id;

    private String model;

    public LaptopJt(String model) {
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
