package general;

public class Static {

    private static int i;
    static {
        System.out.println("In static");
        i = 2;
    }

    public static void main(String[] args) {
        System.out.println("In main");
    }
}
