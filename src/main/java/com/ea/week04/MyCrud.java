package com.ea.week04;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MyCrud {
    private EntityManagerFactory emf;

    public MyCrud(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public boolean deleteStudent(int studentId) {
        EntityManager em = emf.createEntityManager();
        Person tempSt = em.find(Person.class, new Long(studentId));
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
