package multithread;

public class MyThreadTwo implements  Runnable{

    @Override
    public void run() {
        System.out.println(
                "============================================= "+ "\n" +
                "Thread id: " + Thread.currentThread().getId() + "\n" +
                "Thread name: " + Thread.currentThread().getName() + "\n" +
                "Thread Priority: " + Thread.currentThread().getPriority() + "\n" +
                "Thread state: " + Thread.currentThread().getState() + "\n" +
                "Thread group: " + Thread.currentThread().getThreadGroup() + "\n" +
                "Thread isDaemon: " + Thread.currentThread().isDaemon() + "\n"
                );
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
