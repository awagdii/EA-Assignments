package com.ea.week04.table.per.concreteclass;

import javax.persistence.*;

@Entity
@Table(name = "table_per_class_notebook")

public class NotebookTpc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notebook_id")
    private Long id;

    @Column(name = "number_of_pages")
    private int numberOfPages;

    public NotebookTpc(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
