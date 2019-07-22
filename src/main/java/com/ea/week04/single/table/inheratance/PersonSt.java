package com.ea.week04.single.table.inheratance;

import javax.persistence.*;

@Entity
@Table(name = "single_table_person")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class PersonSt {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "person_id")
    private Long id;

    private String name;


    public PersonSt() {
    }

    public PersonSt(String name) {
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
