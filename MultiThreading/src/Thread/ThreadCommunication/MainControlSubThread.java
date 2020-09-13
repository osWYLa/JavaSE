package Thread.ThreadCommunication;

import java.util.concurrent.TimeUnit;

/**
 * @author wyl
 * @create 2020-09-13
 * @Description 线程间通讯，主线程控制子线程
 *
 * @Version
 */
public class MainControlSubThread {
    //主线程
    public static void main(String[] args) {

        SubThread subThread = new SubThread();
        subThread.start();


        for (int i = 1;i<=10;i++){
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("主线程... "+i);
            if (i == 5){
                subThread.setLoop(false);
            }

        }
    }
}
class SubThread extends Thread{
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {

        while (loop) {

            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子 线程... " );
        }

    }
}
