package com.ea.week04.join.table.inhertance;

import javax.persistence.*;

@Entity
@Table(name = "join_table_person")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class PersonJt {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "person_id")
    private Long id;

    private String name;


    public PersonJt() {
    }

    public PersonJt(String name) {
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
