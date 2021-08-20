package multithread;

public class ThreadWithAnonymousClass {

    public static void main(String[] args) throws InterruptedException {

        // with Thread class
        Thread t1 = new Thread(){
            public void run(){
                System.out.println("Thread running...");
            }
        };

        t1.start();
        Thread.sleep(2000);

        // wih interface Runnable
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread running again...");
            }
        };

        Thread t2 = new Thread(r);
        t2.start();

    }
}
