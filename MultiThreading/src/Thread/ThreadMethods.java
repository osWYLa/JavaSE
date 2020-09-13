package Thread;

import javax.sound.midi.Soundbank;

/**
 * @author wyl
 * @create 2020-09-13
 * @Description
 *              常用方法；
 *              setName 设置线程名称
 *              getName 返回线程名称
 *              setPriority 更改线程优先级
 *              getPriority 获取线程优先级
 *              interrupt 中断线程(中断)
 *              sleep
 *
 *
 * @Version
 */
public class ThreadMethods {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        //修改子线程名
        t.setName("第一个子线程");
        System.out.println(t.getName());
        t.start();

        //修改主线程名
        Thread.currentThread().setName("这是主线程");
        System.out.println(Thread.currentThread().getName());

        //获取主线程优先级
        System.out.println(Thread.currentThread().getPriority());

        //主线成通过interrupt控制子线程
        for (int i=1;i<=5;i++){
            Thread.sleep(1000);
            System.out.println("主线程"+i);
        }
        //发出中断给子线程t
        t.interrupt();
        System.out.println("唤醒子线程工作");



    }
}
class T extends Thread{



    @Override
    public void run() {
        while (true)
        {
            try {
                System.out.println("休眠一分钟。。。");
                Thread.sleep(60*1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            //干活
            for (int i=1;i<=10;i++){
                System.out.println("干活。。。"+i);
            }
            System.out.println("工作完成。。。");
            //break 停止子线程
        }

    }

}