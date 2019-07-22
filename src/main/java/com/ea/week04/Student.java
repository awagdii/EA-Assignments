package com.ea.week04;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name="student")
@PrimaryKeyJoinColumn(name="student_id")
public class Student extends Person {


    private double jpa;

    @OneToMany
    @JoinTable(
            name="student_notebook",
            joinColumns = @JoinColumn( name="student_id"),
            inverseJoinColumns = @JoinColumn( name="notebook_id")
    )
    private List<Notebook> notebooks = new ArrayList<>();

    public Student() {
    }

    public Student(String name, double jpa) {
        super(name);
        this.jpa = jpa;
    }

    public double getJpa() {
        return jpa;
    }

    public void setJpa(double jpa) {
        this.jpa = jpa;
    }

    public List<Notebook> getNotebooks() {
        return notebooks;
    }

    public void addNoteBooks(Notebook... notebooks) {
        this.notebooks.addAll(Arrays.asList(notebooks));
    }
}
