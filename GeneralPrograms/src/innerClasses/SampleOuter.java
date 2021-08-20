package innerClasses;

public class SampleOuter {

    private int id;

    public void callOuter(){
        System.out.println("Calling outer...");
    }

    class Inner {
        private int innerClassId;
        public void call(){
            System.out.println("Calling inner...");
        }
    }

    public static void main(String[] args) {

        SampleOuter sampleOuter = new SampleOuter();
        sampleOuter.callOuter();

        SampleOuter.Inner inner = sampleOuter.new Inner();
        inner.call();

    }
}
