package multithread;

public class ThreadGroupDemo implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());

    }

    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("Group-1");

        Thread t1 = new Thread(tg, new ThreadGroupDemo(), "Thread-1");
        Thread t2 = new Thread(tg, new ThreadGroupDemo(), "Thread-2");
        Thread t3 = new Thread(tg, new ThreadGroupDemo(), "Thread-3");

        t1.start();
        t2.start();

        t3.start();

        //ThreadGroup can be accessed by any thread
        // and perform action for all the treads in the group

     //   Thread.currentThread().getThreadGroup().interrupt();

        System.out.println(t1.getThreadGroup().getName());

        tg.list();


    }
}
