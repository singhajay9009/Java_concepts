package com.tdd.sample2;

/*
1. Return list of all Emp ids whose salary is > given salary
2. Return list of all employee names who are Internals
 */

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class EmployeeServiceTest {


    @Test
    public void testEmployeeSalary(){

        EmployeeService employeeService = new EmployeeService();

        List<Employee> listEmployees = List.of(
                new Employee("101", 20000, "Rick"),
                new Employee("102", 30000, "Ema"),
                new Employee("103", 10000, "Rolf"));
        int salary = 10000;

        List<Employee> list = employeeService.getEmployeesWithHigerSalary(listEmployees, salary );
        assertEquals(2, list.size());

        assertTrue(list.stream().map(Employee::getSalary).collect(Collectors.toList()).containsAll(
                List.of(20000, 30000)
        ));
    }

}
