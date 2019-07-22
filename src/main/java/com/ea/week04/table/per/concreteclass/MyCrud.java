package com.ea.week04.table.per.concreteclass;


import com.ea.week04.table.per.concreteclass.inhertance.PersonTpc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class MyCrud {
    private EntityManagerFactory emf;

    public MyCrud(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public boolean deleteStudent(int studentId) {
        EntityManager em = emf.createEntityManager();
        PersonTpc tempSt = em.find(PersonTpc.class, new Long(studentId));
        if (tempSt == null) {
            return false;
        } else {
            em.getTransaction().begin();
            em.remove(tempSt);
            em.getTransaction().commit();
            return true;
        }
    }
}
