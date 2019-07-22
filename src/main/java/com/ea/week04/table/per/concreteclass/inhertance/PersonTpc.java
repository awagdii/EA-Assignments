package com.ea.week04.table.per.concreteclass.inhertance;

import javax.persistence.*;

@Entity
@Table(name = "table_per_class_person")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class PersonTpc {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "person_id")
    private Long id;

    private String name;


    public PersonTpc() {
    }

    public PersonTpc(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
