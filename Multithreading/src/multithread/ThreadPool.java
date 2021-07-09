package multithread;

public class ThreadPool implements Runnable{
    private String message;

    public ThreadPool(String message){
        this.message = message;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " start-" + this.message);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " end-" + this.message);

    }
}
