package com.ea.week04.table.per.concreteclass.inhertance;


import com.ea.week04.table.per.concreteclass.NotebookTpc;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name="table_per_class_student")
@AttributeOverrides({
        @AttributeOverride(name="id", column=@Column(name="person_id")),
        @AttributeOverride(name="name", column=@Column(name="name"))
})  public class StudentTpc extends PersonTpc {


    private double jpa;

    @OneToMany
    @JoinTable(
            name="table_per_class_student_notebook",
            joinColumns = @JoinColumn( name="student_id"),
            inverseJoinColumns = @JoinColumn( name="notebook_id")
    )
    private List<NotebookTpc> notebooks = new ArrayList<>();

    public StudentTpc() {
    }

    public StudentTpc(String name, double jpa) {
        super(name);
        this.jpa = jpa;
    }

    public double getJpa() {
        return jpa;
    }

    public void setJpa(double jpa) {
        this.jpa = jpa;
    }

    public List<NotebookTpc> getNotebooks() {
        return notebooks;
    }

    public void addNoteBooks(NotebookTpc... notebooks) {
        this.notebooks.addAll(Arrays.asList(notebooks));
    }
}
