package com.ramesh.java8coding;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int age;
    private int id;

    public Employee(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}

public class GroupEmployeesByAge {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Ramesh", 25, 1),
                new Employee("Suresh", 30, 2),
                new Employee("Mahesh", 25, 3),
                new Employee("Rajesh", 30, 4),
                new Employee("Naresh", 35, 5)
        );

        // group by employees age
        Map<Integer, List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getAge));

        map.forEach((key,value)->{
            System.out.println("Age: " + key);
            System.out.println("Employees: " + value);
        });
    }
}
