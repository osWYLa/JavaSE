package Thread;

/**
 * @author wyl
 * @create 2020-09-13
 * @Description Thread VS Runnable
 * @Version
 */
public class TwoThreadRun {
    public static void main(String[] args) {
        //使用继承Thread，多线程需要创建多个T1对象
         new T1().start();//两个线程里的n分别属于两个对象，是不同的
         new T1().start();

        //使用实现Runnable接口方式，只需要创建一个T2对像， 传递给Thread构造器即可
        T2 t2 = new T2();
        new Thread(t2).start();  //这两个线程持有一份m，这里的m并不是static。有利于资源共享
        new Thread(t2).start();


        System.out.println("主线程..."); //主线程结束？
        //结束进程
        //System.exit(0);//进程结束，所有线程全部结束
    }
}

class T1 extends Thread {
    private int n = 10;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello T1继承Thread" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class T2 implements Runnable {
    private int m = 10;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello T2实现Runnable接口" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

