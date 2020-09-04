package Thread.CreatThread.SafetyOfThread;

/**
 * @author wyl
 * @create 2020-08-07
 * @Description
 * @Version
 */
public class SynchronizedThread implements Runnable {
    int i = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {//同步锁，锁齐标
                if (i < 0) break;
                System.out.println(Thread.currentThread().getName()    +  "  "+   i);
                i--;
                Thread.yield();

            }
        }
    }
}
