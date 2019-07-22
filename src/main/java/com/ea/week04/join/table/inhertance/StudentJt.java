package com.ea.week04.join.table.inhertance;

import com.ea.week04.join.table.NotebookJt;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name="join_table_student")
@AttributeOverrides({
        @AttributeOverride(name="id", column=@Column(name="person_id")),
        @AttributeOverride(name="name", column=@Column(name="name"))
})  public class StudentJt extends PersonJt {


    private double jpa;

    @OneToMany
    @JoinTable(
            name="join_table_student_notebook",
            joinColumns = @JoinColumn( name="student_id"),
            inverseJoinColumns = @JoinColumn( name="notebook_id")
    )
    private List<NotebookJt> notebooks = new ArrayList<>();

    public StudentJt() {
    }

    public StudentJt(String name, double jpa) {
        super(name);
        this.jpa = jpa;
    }

    public double getJpa() {
        return jpa;
    }

    public void setJpa(double jpa) {
        this.jpa = jpa;
    }

    public List<NotebookJt> getNotebooks() {
        return notebooks;
    }

    public void addNoteBooks(NotebookJt... notebooks) {
        this.notebooks.addAll(Arrays.asList(notebooks));
    }
}
