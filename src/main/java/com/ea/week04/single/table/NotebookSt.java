package com.ea.week04.single.table;

import javax.persistence.*;

@Entity
@Table(name = "single_table_notebook")

public class NotebookSt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notebook_id")
    private Long id;

    @Column(name = "number_of_pages")
    private int numberOfPages;

    public NotebookSt(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
