package Thread.CreatThread;

/**
 * @author wyl
 * @create 2020-08-07
 * @Description 线程和线程体分开
 * @Version
 */
public class RunnableTest {
    public static void main(String[] args) {

        RunnableThread runnableThread = new RunnableThread();
        Thread thread = new Thread(runnableThread);

        thread.setPriority(Thread.MAX_PRIORITY);//线程优先级高只是大概率会优先执行而已

        thread.start();//线程

        System.out.println(thread.getPriority());

        Thread.yield(); //当前线程让出CPU?????

       /* try {
            Thread.sleep(1000);//此处主线程休眠后，并非直接执行，依然要去抢占CPU
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        //主线程测试
        for(int i=0;i<100;i++)
            System.out.println("main-->"+i);

    }
}
