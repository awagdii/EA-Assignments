/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangedbeans;

import ea.car.example.Car;
import ea.car.example.dao.MyPersister;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author ahmed
 */
@ManagedBean(name = "carBean", eager = true)
@SessionScoped
public class CarBean implements Serializable {

    MyPersister myPersister = new MyPersister();
    public Car car = new Car();

    public void save() {

        myPersister.save(car);

        car = new Car();

    }

    public void update() {

        myPersister.update(car);

        car = new Car();

    }

    public void delete() {

        myPersister.delete(car);

        car = new Car();

    }

    public void find() {

        car = myPersister.find(car.getId());

    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

}
