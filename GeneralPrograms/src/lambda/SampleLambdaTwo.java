package lambda;

public class SampleLambdaTwo {

    public static void main(String[] args) {

        Convertible<Integer, String> con = (Integer x) -> String.valueOf(x);

        // using method ref.
        //Convertible<Integer, String> con = (Integer x) -> String.valueOf(x);

        String s = con.convert(5);
        System.out.println(s);
        System.out.println(s instanceof String); // true
    }

}
