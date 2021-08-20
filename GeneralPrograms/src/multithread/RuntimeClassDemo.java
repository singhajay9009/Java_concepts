package multithread;

import java.io.IOException;

public class RuntimeClassDemo {

    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.availableProcessors());

        System.out.println(runtime.freeMemory());

        System.out.println(runtime.totalMemory());


      //  runtime.exec("notepad");
    }
}
