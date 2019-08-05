package ea.car.example.dao;

import ea.car.example.Car;
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

    public Car find(Long id) {
        Car car = em.find(Car.class, id);
        return car;
    }

    public void update(Car car) {

        Car carUpdate = em.find(Car.class, car.getId());
        carUpdate.setMiles(car.getMiles());
//        carUpdate.setColor(car.getColor());

        carUpdate.setModel(car.getModel());

        carUpdate.setYear(car.getYear());
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        tx.commit();
    }

    public void delete(Car car) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.remove(car);
        tx.commit();
    }
}
