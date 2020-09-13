package Thread;

import java.util.concurrent.TimeUnit;

/**
 * @author wyl
 * @create 2020-09-13
 * @Description
 * @Version
 */
public class Thread02 {
    public static void main(String[] args) {

        //创建实现了Runnable接口的对象
        MyThread02 myThread02 = new MyThread02();
        //myThread02对象中没有start方法，将此对象放入Thread的构造器
        Thread thread = new Thread(myThread02);
        thread.start();




        for (int i=0;i<99;i++){
            try {
                System.out.println("主线程打印"+i);

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class MyThread02 implements Runnable{

    @Override
    public void run() {
        try {

            for (int i=0;i<99;i++){
                System.out.println("实现Runnable接口创建子线程"+i);
                TimeUnit.SECONDS.sleep(1); //可以指定时间单位
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
