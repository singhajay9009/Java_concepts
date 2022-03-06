package inheritance;

public class StaticVariable {

    private static int i;

    static{
        i++;
    }

    public StaticVariable(){
        i++;
    }

    public static void main(String[] args) {
        new StaticVariable();
        new StaticVariable();
        System.out.println(StaticVariable.i);
    }
}
