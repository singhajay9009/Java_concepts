package general;

public class FinalSample {

    private final int age;

    public FinalSample(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        FinalSample finalSample = new FinalSample(23);

        System.out.println("This is age: " + finalSample.age);

        FinalSample finalSample1 = new FinalSample(24);

        System.out.println("This is age again: " + finalSample1.age);
    }

}
