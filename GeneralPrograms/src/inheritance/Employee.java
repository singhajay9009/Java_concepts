package inheritance;

public class Employee {

    private int id;
    private String name;

    public Employee() {

    }

    public Employee(int id){
        this.id = id;
        System.out.println("In Employee with id");
    }

    public Employee(int id, String name){
        this(id);
        this.name = name;
        System.out.println("In Employee with id, name");
    }

}
