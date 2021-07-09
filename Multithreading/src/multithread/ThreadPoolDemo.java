package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*ExecutorService interface provides usage for Executors class
    Executors.newFixedThreadPool(5) will create pool of 5 Threads.
 */


public class ThreadPoolDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for(int i=0; i<5; i++){
            Runnable thread = new ThreadPool("" + i);
            executorService.execute(thread);
        }
        executorService.shutdown();
        while(executorService.isTerminated()){
            System.out.println("executor running!");
        }

        System.out.println("executor finished");
    }
}
