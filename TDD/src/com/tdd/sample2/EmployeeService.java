package com.tdd.sample2;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

    public List<Employee> getEmployeesWithHigerSalary(List<Employee> list, int salary){

        return list.stream().filter(e -> e.getSalary()> salary).collect(Collectors.toList());

    }
}
