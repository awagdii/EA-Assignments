package com.ea.assignment01;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MyPersister {
    private EntityManager em;
    private EntityManagerFactory emf;

    public MyPersister() {
        emf = Persistence.createEntityManagerFactory("jpa-assignment");
        em = emf.createEntityManager();
    }

    public void start() {
        if (emf != null) {
            end();
        }
        emf = Persistence.createEntityManagerFactory("jpa-assignment");
        em = emf.createEntityManager();
    }

    public void end() {
        if (emf != null) {
            em.close();
            emf.close();
            emf = null;
        }
    }

    public void save(Car car) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(car);
        tx.commit();
    }
}
