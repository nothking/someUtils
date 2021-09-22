import java.util.*;

public class ThreadTest {

    static int num = 0;

    public static void main(String[] args) throws Exception {
        
        List<Thread> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new Thread(()->{
                for(int x = 0;x <10000 ; x++){
                    num++;
                }
            }));
        }
        for(Thread t :list){
            t.start();
        }

        Thread.sleep(1000L);
        System.out.println(num);
    }


}
