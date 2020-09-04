package Thread.CreatThread.SafetyOfThread;

/**
 * @author wyl
 * @create 2020-08-07
 * @Description
 * @Version
 */
public class MyThread implements Runnable {
    int i = 100;

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + i);
            i--;
            //让出当前线程的CPU占用
            Thread.yield();
            if (i < 0) break;
        }
    }
}
