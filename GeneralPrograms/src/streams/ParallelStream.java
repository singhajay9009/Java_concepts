package streams;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {
    Product p1 = new Product(101, "Laptop", 200.50);
    Product p2 = new Product(102, "Camera", 150.75);
    Product p3 = new Product(103, "Printer", 50.00);
    Product p4 = new Product(104, "Camera", 200.75);


    List<Product> listProducts = Arrays.asList(p1,p2,p3,p4);
    public List<Product> getProducts() {
        return listProducts;
    }
    public static void main(String[] args) {

        List<Product> list = new ParallelStream().getProducts();

        list.stream().parallel().forEach(p -> System.out.println(p.getPrice()));

        //converting a parallel stream back to Sequential
        list.stream().parallel().sequential();
    }

    /*
    We need to ensure that the code is thread-safe. Special care needs to be taken if the operations performed in parallel modifies shared data.
We should not use parallel streams if the order in which operations are performed or the order returned in the output stream matters. For example operations like findFirst() may generate the different result in case of parallel streams.
Also, we should ensure that it is worth making the code execute in parallel. Understanding the performance characteristics of the operation in particular, but also of the system as a whole – is naturally very important here.
     */
}
