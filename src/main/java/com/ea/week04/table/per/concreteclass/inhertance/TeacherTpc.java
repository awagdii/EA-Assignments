package com.ea.week04.table.per.concreteclass.inhertance;


import com.ea.week04.table.per.concreteclass.LaptopTpc;

import javax.persistence.*;

@Entity
@Table(name = "table_per_class_teacher")
@AttributeOverrides({
        @AttributeOverride(name="id", column=@Column(name="teacher_id")),
        @AttributeOverride(name="name", column=@Column(name="name"))
})  public class TeacherTpc extends PersonTpc {
    private double salary;

    @OneToOne
    @JoinColumn(name = "laptop_id")
    private LaptopTpc laptop;

    public TeacherTpc() {
    }

    public TeacherTpc(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LaptopTpc getLaptop() {
        return laptop;
    }

    public void setLaptop(LaptopTpc laptop) {
        this.laptop = laptop;
    }
}
