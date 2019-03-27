package com.ttn.jpa.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
//@NamedNativeQuery(name = "Person.findByNameIs",
//        query = "SELECT * from Person where name = :name",
//        resultClass = Person.class)
public class Person implements Serializable {

    public Person() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String fName;

    private String lName;

    private Integer age;

    private Integer salary;

    public Person(String fName, String lName, Integer age, Integer salary) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }


}