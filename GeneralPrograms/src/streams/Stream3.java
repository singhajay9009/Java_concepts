package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream3 {
    Product p1 = new Product(101, "Laptop", 200.50);
    Product p2 = new Product(102, "Camera", 150.75);
    Product p3 = new Product(103, "Printer", 50.00);
    Product p4 = new Product(104, "Camera", 200.75);

    // Using Stream to collect
    Stream<Product> stream = Stream.of(p1, p2, p3, p4);


    public Stream<Product> getStream() {
        return stream;
    }

    List<Product> listProducts = Arrays.asList(p1,p2,p3,p4);
    public List<Product> getProducts(){
        return listProducts;
    }




    public static void main(String[] args) {
        Stream<Product> stream = new Stream3().getStream();

        List<Product> listProducts = new Stream3().getProducts();

        List<String> productNames = stream
                .filter(e-> e.getPrice()> 100.00)
                .map(Product::getName)
                .distinct()
                .collect(Collectors.toList());

        productNames.forEach(System.out::println);


        Set<String> prodNames = listProducts.stream().filter(p -> {
            System.out.println("This is product");
            return p.getPrice()> 100.00;
        }).map(p -> {
            System.out.println("product names");
            return p.getName();
        }).collect(Collectors.toUnmodifiableSet());



    }
}

