package com.ea.week04.single.table;

import com.ea.week04.join.table.MyCrud;
import com.ea.week04.single.table.inheratance.StudentSt;
import com.ea.week04.single.table.inheratance.TeacherSt;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {

    public static void main(String[] args) {
        StudentSt jack = new StudentSt("jack", 3.4);
        StudentSt john = new StudentSt("john", 3.2);
        StudentSt jill = new StudentSt("jill", 3.6);
        TeacherSt jim = new TeacherSt("jim", 45000);
        TeacherSt jasmin = new TeacherSt("jasmin", 46000);

        NotebookSt pages100 = new NotebookSt(100);
        NotebookSt pages120 = new NotebookSt(120);
        NotebookSt pages60 = new NotebookSt(60);
        NotebookSt pages200 = new NotebookSt(200);
        NotebookSt pages50 = new NotebookSt(50);
        NotebookSt pages300 = new NotebookSt(300);

        jack.addNoteBooks(pages100, pages120, pages60);
        john.addNoteBooks(pages200, pages50);
        jill.addNoteBooks(pages300);

        LaptopSt mac = new LaptopSt("mac");
        LaptopSt dell = new LaptopSt("dell");

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
