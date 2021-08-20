package multithread;

public class ShutDownHookDemo implements  Runnable{
    @Override
    public void run() {
        System.out.println("Thread details: " + Thread.currentThread().getState());
    }


    public static void main(String[] args) throws InterruptedException {
      //  Runtime.getRuntime().addShutdownHook(new Thread(new ShutDownHookDemo()));
        // press cmd + c  as main thread is sleeping
        // you will see run () method above will execute
        Thread.sleep(4000);

        // using anonymous class

//        Runtime.getRuntime().addShutdownHook(new Thread(){
//            @Override
//            public void run() {
//                System.out.println("Thread details anonymous: " + Thread.currentThread().getState());
//            }
//        });

    }
}
