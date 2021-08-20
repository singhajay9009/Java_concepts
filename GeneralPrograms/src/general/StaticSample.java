package general;

public class StaticSample {

    private static int count;

    static{
        count++;
    }

    public StaticSample(){
        count ++;
        System.out.println(count);
    }

}
