package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class EmployeeStreamQuestion {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee("Adam", "Berlin", 20, 2400.0),
                        new Employee("Adam", "Berlin", 32, 23000.0),
                        new Employee("Anna", "Berlin", 24, 12000.0),
                        new Employee("Anna", "Hamburg", 25, 1000.0),
                        new Employee("Andrew", null, 26, 12000.0),
                        new Employee(null, "Berlin", 21, 12000.0),
                        null);

        new EmployeeStreamQuestion().getDistinctEmployeeBasedOnCity(employees).forEach(System.out::println);
    }

    public List<String> getDistinctEmployeeBasedOnCity(List<Employee> employees){


        List<String> emps=  employees.stream()
                .filter(e -> e != null && e.getCity() != null && e.getCity().equals("Berlin"))
                .map(Employee::getName).filter(Objects::nonNull).distinct().collect(Collectors.toList());

        return emps;

    }


    public double getMaxSalary(double salary){

        return 0.0d;
    }
}


class Employee{
    private String name;
    private String city;
    private int age;
    private double salary;

    public Employee(String name, String city, int age, double salary){
        this.name = name;
        this.city = city;
        this.age = age;
        this.salary = salary;
    }
    public String getCity(){
        return this.city;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public double getSalary(){
        return this.salary;
    }
}



//public class StringOperation{
//
//    psvm(){
//
//
//        String str = "abc";
//
//        char[] chars = str.toCharArray();
//        StringBuilder sb = new StringBuilder();
//        for(int i=chars.length-1; i>=0; i--){
//
//
//            sb.append(chars[i]);
//        }
//
//        sb.toString();
//
//    }
//
//
//}
