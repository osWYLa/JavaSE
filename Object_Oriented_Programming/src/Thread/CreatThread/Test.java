package Thread.CreatThread;

/**
 * @author wyl
 * @create 2020-08-07
 * @Description
 * @Version
 */
public class Test {
    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread();
        // firstThread.run();//-->只是run并没有启动一个新的线程
        firstThread.start();//-->此时线程进入就绪状态，抢占CPU
                            //要想启动一个新的线程，必须使用start方法；
                            //单单只是执行run,只是将run方法体的内容放在主线程执行而已；
                            //start之后，存在三个线程；主线程、start启动的那个线程、垃圾回收线程

        //主线程测试
        for (int i = 0; i < 100; i++)
            System.out.println("main-->" + i);
    }
}
