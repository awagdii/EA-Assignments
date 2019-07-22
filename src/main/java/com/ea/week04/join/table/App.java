package com.ea.week04.join.table;

import com.ea.week04.join.table.inhertance.StudentJt;
import com.ea.week04.join.table.inhertance.TeacherJt;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {

    public static void main(String[] args) {
        StudentJt jack = new StudentJt("jack", 3.4);
        StudentJt john = new StudentJt("john", 3.2);
        StudentJt jill = new StudentJt("jill", 3.6);
        TeacherJt jim = new TeacherJt("jim", 45000);
        TeacherJt jasmin = new TeacherJt("jasmin", 46000);

        NotebookJt pages100 = new NotebookJt(100);
        NotebookJt pages120 = new NotebookJt(120);
        NotebookJt pages60 = new NotebookJt(60);
        NotebookJt pages200 = new NotebookJt(200);
        NotebookJt pages50 = new NotebookJt(50);
        NotebookJt pages300 = new NotebookJt(300);

        jack.addNoteBooks(pages100, pages120, pages60);
        john.addNoteBooks(pages200, pages50);
        jill.addNoteBooks(pages300);

        LaptopJt mac= new LaptopJt("mac");
        LaptopJt dell= new LaptopJt("dell");

        jim.setLaptop(mac);
        jasmin.setLaptop(dell);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-assignment");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.persist(pages100);
        em.persist(pages120);
        em.persist(pages60);
        em.persist(pages200);
        em.persist(pages50);
        em.persist(pages300);
        em.persist(jack);
        em.persist(john);
        em.persist(jill);
        em.persist(dell);
        em.persist(mac);
        em.persist(jim);
        em.persist(jasmin);
        MyCrud myCrud = new MyCrud(emf);
        myCrud.deleteStudent(1);
        tx.commit();


        em.close();
        emf.close();


    }
}
