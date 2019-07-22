package com.ea.week04.single.table;


import com.ea.week04.single.table.inheratance.PersonSt;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class MyCrud {
    private EntityManagerFactory emf;

    public MyCrud(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public boolean deleteStudent(int studentId) {
        EntityManager em = emf.createEntityManager();
        PersonSt tempSt = em.find(PersonSt.class, new Long(studentId));
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
