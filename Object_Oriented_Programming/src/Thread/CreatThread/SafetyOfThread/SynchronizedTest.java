package Thread.CreatThread.SafetyOfThread;

/**
 * @author wyl
 * @create 2020-08-07
 * @Description
 * @Version
 */
public class SynchronizedTest {
    public static void main(String[] args) {
        SynchronizedThread synchronizedThread = new SynchronizedThread();

        //生成两个Thread对象，但这两个Thread对象公用同一个线程体
        Thread thread01 = new Thread(synchronizedThread);
        Thread thread = new Thread(synchronizedThread);

        thread.setName("线程2");
        thread01.setName("线程1");

        thread01.start();
        thread.start();
    }
}
