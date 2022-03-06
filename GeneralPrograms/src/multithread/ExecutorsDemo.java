package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId());
        try {
            Thread.sleep(2000);
            System.out.println("Completed: " + Thread.currentThread().getId());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i =0; i<4; i++){
            executorService.submit(new ExecutorsDemo());
        }
        executorService.shutdown();
    }
}
