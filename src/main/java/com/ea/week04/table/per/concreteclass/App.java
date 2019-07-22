package com.ea.week04.table.per.concreteclass;

import com.ea.week04.join.table.MyCrud;
import com.ea.week04.table.per.concreteclass.inhertance.StudentTpc;
import com.ea.week04.table.per.concreteclass.inhertance.TeacherTpc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {

    public static void main(String[] args) {
        StudentTpc jack = new StudentTpc("jack", 3.4);
        StudentTpc john = new StudentTpc("john", 3.2);
        StudentTpc jill = new StudentTpc("jill", 3.6);
        TeacherTpc jim = new TeacherTpc("jim", 45000);
        TeacherTpc jasmin = new TeacherTpc("jasmin", 46000);

        NotebookTpc pages100 = new NotebookTpc(100);
        NotebookTpc pages120 = new NotebookTpc(120);
        NotebookTpc pages60 = new NotebookTpc(60);
        NotebookTpc pages200 = new NotebookTpc(200);
        NotebookTpc pages50 = new NotebookTpc(50);
        NotebookTpc pages300 = new NotebookTpc(300);

        jack.addNoteBooks(pages100, pages120, pages60);
        john.addNoteBooks(pages200, pages50);
        jill.addNoteBooks(pages300);

        LaptopTpc mac = new LaptopTpc("mac");
        LaptopTpc dell = new LaptopTpc("dell");

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
        com.ea.week04.join.table.MyCrud myCrud = new MyCrud(emf);
        myCrud.deleteStudent(1);
        tx.commit();


        em.close();
        emf.close();


    }
}
