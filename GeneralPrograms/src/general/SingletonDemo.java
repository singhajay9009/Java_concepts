package general;

import java.util.Optional;

public class SingletonDemo {
    public static void main(String[] args) {
        SampleSingleton ss = SampleSingleton.getClassInstance();
        ss.readMessage("Hi Java");

        SampleSingleton ss1 = SampleSingleton.getClassInstance();
        ss1.readMessage("Hi Javascript");

    }
}
class SampleSingleton{

    private static SampleSingleton sampleSingleton;
    private SampleSingleton(){

    }
    public static SampleSingleton getClassInstance(){
        if(sampleSingleton == null){
            synchronized (SampleSingleton.class){
                return new SampleSingleton();
            }
        }else{
            return sampleSingleton;
        }
    }

    public void readMessage(String msg){
        System.out.println(msg);;
    }

}
