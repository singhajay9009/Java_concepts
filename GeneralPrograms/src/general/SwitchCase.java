package general;

public class SwitchCase {

    public static void main(String[] args) {
        String str = "B";
        switch (str){

            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");

            case "C":
                System.out.println("C");

            default:
                System.out.println("NONE");
        }
    }
}
