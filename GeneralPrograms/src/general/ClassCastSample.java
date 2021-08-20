package general;
import static java.lang.System.*;
public class ClassCastSample {

    public static void main(String[] args) {
        int i = 6;
        byte b = 7;
        int j = b;
        byte bt = (byte)i;


        out.println(bt);
    }
}
