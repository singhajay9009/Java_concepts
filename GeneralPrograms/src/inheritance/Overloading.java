package inheritance;

public class Overloading {

    public int add(short a, int b){
        System.out.println("In int");
        return a + b;
    }
    public int add(int a, short b){
        System.out.println("in short");
        return a + b;
    }


    public long add(int a, long b){
        System.out.println("In long");
        return a + b;
    }
    public int add(short a, short b){
        System.out.println("in both short");
        return a + b;
    }


    public static void main(String[] args) {
        System.out.println(new Overloading().add(1,2));
        System.out.println(new Overloading().add(1, 1000000000000000000L));
    }
}
