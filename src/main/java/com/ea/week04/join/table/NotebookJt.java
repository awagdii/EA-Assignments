package com.ea.week04.join.table;

import javax.persistence.*;

@Entity
@Table(name = "join_table_notebook")
public class NotebookJt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notebook_id")
    private Long id;

    @Column(name = "number_of_pages")
    private int numberOfPages;

    public NotebookJt(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
