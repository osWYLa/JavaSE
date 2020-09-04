package Thread.CreatThread.SafetyOfThread;

/**
 * @author wyl
 * @create 2020-08-07
 * @Description
 * @Version
 */
public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        //生成两个Thread对象，但这两个Thread对象公用同一个线程体
        Thread thread01 = new Thread(myThread);
        Thread thread = new Thread(myThread);

        thread.setName("线程2");
        thread01.setName("线程1");

        thread01.start();
        thread.start();
        //会出现同时获取同一个i 的情况，出现数据不安全，线程不安全
    }
}
