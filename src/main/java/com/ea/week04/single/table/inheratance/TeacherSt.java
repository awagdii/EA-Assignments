package com.ea.week04.single.table.inheratance;


import com.ea.week04.single.table.LaptopSt;

import javax.persistence.*;

@Entity
@Table(name = "single_table_teacher")
@AttributeOverrides({
        @AttributeOverride(name="id", column=@Column(name="teacher_id")),
        @AttributeOverride(name="name", column=@Column(name="name"))
})  public class TeacherSt extends PersonSt {
    private double salary;

    @OneToOne
    @JoinColumn(name = "laptop_id")
    private LaptopSt laptop;

    public TeacherSt() {
    }

    public TeacherSt(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LaptopSt getLaptop() {
        return laptop;
    }

    public void setLaptop(LaptopSt laptop) {
        this.laptop = laptop;
    }
}
