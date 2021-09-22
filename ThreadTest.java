import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTest {

    static AtomicInteger num = new AtomicInteger(0);

    public static void main(String[] args) throws Exception {

        List<Thread> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new Thread(() -> {
                for (int x = 0; x < 1000000; x++) {
                    num.incrementAndGet();
                }
            }));
        }
        for (Thread t : list) {
            t.start();
        }

        Thread.sleep(1000L);
        System.out.println(num);
    }

}
