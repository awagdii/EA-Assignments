package com.ea.week04.single.table.inheratance;


import com.ea.week04.single.table.NotebookSt;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name="single_table_student")
@AttributeOverrides({
        @AttributeOverride(name="id", column=@Column(name="person_id")),
        @AttributeOverride(name="name", column=@Column(name="name"))
})  public class StudentSt extends PersonSt {


    private double jpa;

    @OneToMany
    @JoinTable(
            name="single_table_student_notebook",
            joinColumns = @JoinColumn( name="student_id"),
            inverseJoinColumns = @JoinColumn( name="notebook_id")
    )
    private List<NotebookSt> notebooks = new ArrayList<>();

    public StudentSt() {
    }

    public StudentSt(String name, double jpa) {
        super(name);
        this.jpa = jpa;
    }

    public double getJpa() {
        return jpa;
    }

    public void setJpa(double jpa) {
        this.jpa = jpa;
    }

    public List<NotebookSt> getNotebooks() {
        return notebooks;
    }

    public void addNoteBooks(NotebookSt... notebooks) {
        this.notebooks.addAll(Arrays.asList(notebooks));
    }
}
