package inheritance;

public class PermanentEmployee extends Employee{

    private int id;
    private String name;
    private String employeeType;

    public PermanentEmployee(int id, String name, String employeeType) {
        super(id, name);
        this.employeeType = employeeType;
        System.out.println("In Child class");
    }
}
