package com.tdd.sample2;

public class Employee {

    private String id;
    private int salary;
    private String name;

    public Employee(String id, int salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
