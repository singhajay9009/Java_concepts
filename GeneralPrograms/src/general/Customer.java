package general;

import java.util.Objects;

public class Customer {

    private int id;
    private String name;
    private double salary;
    private boolean isMale;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && Double.compare(customer.salary, salary) == 0 && isMale == customer.isMale && Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, isMale);
    }
}
