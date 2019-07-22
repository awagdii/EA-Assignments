package com.ea.week04;

import org.hibernate.jpa.internal.EntityManagerImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {

    public static void main(String[] args) {
        Student jack = new Student("jack", 3.4);
        Student john = new Student("john", 3.2);
        Student jill = new Student("jill", 3.6);
        Teacher jim = new Teacher("jim", 45000);
        Teacher jasmin = new Teacher("jasmin", 46000);

        Notebook pages100 = new Notebook(100);
        Notebook pages120 = new Notebook(120);
        Notebook pages60 = new Notebook(60);
        Notebook pages200 = new Notebook(200);
        Notebook pages50 = new Notebook(50);
        Notebook pages300 = new Notebook(300);

        jack.addNoteBooks(pages100, pages120, pages60);
        john.addNoteBooks(pages200, pages50);
        jill.addNoteBooks(pages300);

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
        MyCrud myCrud = new MyCrud(emf);
        myCrud.deleteStudent(1);
        tx.commit();


        em.close();
        emf.close();


    }
}
