package homeworks14;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BaseTask {
    public static void main(String[] args) throws InterruptedException {
        /** Thread homework - basic.
         *  used Class LiftOff implement interface Runnable
         *  and override method run() */

        Thread thread1 = new Thread(new LiftOff());
        Thread thread2 = new Thread(new LiftOff());
        Thread thread3 = new Thread(new LiftOff());

        thread1.setName("Thread 1");
        thread2.setName("Thread 2");
        thread3.setName("Thread 3");

        System.out.println('\n' + thread3.getName());
        thread3.start();
        thread3.join();

        System.out.println('\n' + thread2.getName());
        thread2.start();
        thread2.join();

        System.out.println('\n' + thread1.getName());
        thread1.start();
        thread1.join();


        System.out.println("\n All threads have finished!");


//        ExecutorService exec = Executors.newSingleThreadExecutor();
//        for (int i = 3; i >0 ; i--) {
//            exec.execute(new LiftOff(5));
//        }            exec.shutdown();


    }

}
