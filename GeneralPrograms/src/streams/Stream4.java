package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream4 {

    Product p1 = new Product(101, "Laptop", 200.50);
    Product p2 = new Product(102, "Camera", 150.75);
    Product p3 = new Product(103, "Printer", 50.00);
    Product p4 = new Product(104, "Camera", 200.75);
    Product p5 = new Product(105, "recorder", null);


    List<Product> listProducts = Arrays.asList(p1,p2,p3,p4);
    public List<Product> getProducts(){
        return listProducts;
    }

    public static void main(String[] args) {

        List<Product> list = new Stream4().getProducts();

        //Finding Sum
        Double sum = list.stream()
                .map(Product::getPrice)
                .filter(Objects::nonNull)
                .reduce(0.0, Double::sum);

        System.out.println("Sum is: " + sum);

        //Finding Max
        double max = list.stream()
                .mapToDouble(Product::getPrice)
                .max()
                .orElseGet(() -> 0.0);

        List<Product> list1 = new ArrayList<>();
        list1.stream().map(Product::getPrice)
                .max(Comparator.comparing(Double::new))
                .orElseGet(()-> 0.0);

        //Finding Min
        OptionalDouble min = list.stream()
                .mapToDouble(Product::getPrice)
                .min();

//        Double tmp1 = list.stream()
//                .mapToDouble(Product::getPrice)
//                .min()


        OptionalDouble avg = list.stream()
                .mapToDouble(Product::getPrice)
                .average();


       double average =  avg.orElseGet(() -> 0.0);


       // if yu want to throw exception instead returning a default
      // double aveg = avg.orElseThrow(Exception::new);


        System.out.println("Min: " + min.getAsDouble() + " Max: " + max + " Avg.: " + average);

         // ********* Important **************
        // Return the product based on the comparator
        Product product = list.stream()
                .max(Comparator.comparing(Product::getPrice))
                .orElseThrow(NoSuchElementException::new);

        //Sorting based on a Comparator
        List<Product> prods = list.stream()
                // for multiple comparisons
                .sorted(Comparator.comparing(Product::getName).thenComparing(Product::getId))
                .collect(Collectors.toList());
        prods.stream().map(Product::getName).forEach(System.out::println);
    }
}


