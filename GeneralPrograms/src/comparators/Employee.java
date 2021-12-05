package comparators;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        int i = Integer.compare(o1.getId(), o2.getId());
        return i!=0 ? i : o1.getName().compareTo(o2.getName());
    }
}
