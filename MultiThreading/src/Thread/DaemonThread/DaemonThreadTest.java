package Thread.DaemonThread;

/**
 * @author wyl
 * @create 2020-09-14
 * @Description 守护线程：一般为工作线程服务。（结束时机：当所有用户线程结束，则守护线程自动结束）-----常见的是：垃圾回收线程
 * 用户线程：也称工作线程。（结束时机：线程任务执行完成或者通过通知方式结束）
 * @Version
 */
public class DaemonThreadTest {
    public static void main(String[] args) throws InterruptedException {
        MyDaemon myDaemon = new MyDaemon();
        //将子线程设置为守护线程
        myDaemon.setDaemon(true);

        myDaemon.start();

        //主线程
        for (int  i=1;i<=5;i++){
            Thread.sleep(1000);
            System.out.println("主线程工作");
        }
    }
}

class MyDaemon extends Thread {
    @Override
    public void run() {
        for (; ; ) {//死循环
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("聊天。。。");
        }

    }
}