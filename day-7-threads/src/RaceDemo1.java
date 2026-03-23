

import java.util.logging.Logger;

public class RaceDemo1 {
    public static void main(String[] args) throws InterruptedException {
        Logger logger = Logger.getLogger("threads");

        Counter counter = new Counter();
        Thread t1 = new Worker1(counter);
        t1.setDaemon(true); // becomes daemon thread
        t1.start();
        System.out.println("1= " + counter.getValue());

//        Thread t2 = new Worker1(counter);
//        System.out.println("2= " + counter.getValue());
//        t2.start();
//
//        t1.join();
//        t2.join();

        System.out.println("3= " + counter.getValue());
//        logger.info(String.format("3 = %d", counter.getValue()));

        System.out.println("Main finished");
        System.out.println("t1 is daemon? " + t1.isDaemon());
    }
}
