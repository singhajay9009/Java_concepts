package multithread;

public class MyThreadThree implements  Runnable{

    @Override
    public void run() {
  //      System.out.println("Thread is running..." + Thread.currentThread().getName());
        for(int i=0; i<5; i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread is running..." + Thread.currentThread().getName());

        }
    }
}
