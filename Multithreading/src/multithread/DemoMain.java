package multithread;

public class DemoMain {

    public static void main(String[] args) throws InterruptedException {
        int num = 4;
//        for (int i=0; i<num; i++){
//            MyThread myThread = new MyThread(new MyThread());
//            myThread.start();
//        }

//        for (int i=0; i<num; i++){
//            Thread thread = new Thread(new MyThreadTwo());
//            thread.start();
//        }

        Thread t1 = new Thread(new MyThreadThree());
        Thread t2 = new Thread(new MyThreadThree());
        Thread t3 = new Thread(new MyThreadThree());

        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        // We started t1.
        // We want t2 to start only after t1 completes.
        // Call join() method on t1.
        t1.start();
        t1.join();

        // t2 will start only after t1 has completed execution
        t2.start();

        // t3 might start in between t2 is still running
        t3.start();
    }
}
