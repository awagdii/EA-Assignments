package com.ea.week04.join.table.inhertance;

import com.ea.week04.join.table.LaptopJt;

import javax.persistence.*;

@Entity
@Table(name = "join_table_teacher")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "teacher_id")),
        @AttributeOverride(name = "name", column = @Column(name = "name"))
})
public class TeacherJt extends PersonJt {
    private double salary;

    @OneToOne
    @JoinColumn(name = "laptop_id")
    private LaptopJt laptop;

    public TeacherJt() {
    }

    public TeacherJt(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LaptopJt getLaptop() {
        return laptop;
    }

    public void setLaptop(LaptopJt laptop) {
        this.laptop = laptop;
    }
}
