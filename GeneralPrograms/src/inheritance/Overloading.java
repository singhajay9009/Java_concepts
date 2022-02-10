package inheritance;

public class Overloading {

    public int add(int a, int b){
        return a + b;
    }

    public long add(int a, long b){
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(new Overloading().add(1,2));
        System.out.println(new Overloading().add(1, 1000000000000000000L));
    }
}
