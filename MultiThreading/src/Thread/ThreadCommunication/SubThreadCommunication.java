package Thread.ThreadCommunication;

import java.util.Scanner;

/**
 * @author wyl
 * @create 2020-09-13
 * @Description
 * @Version
 */
public class SubThreadCommunication {
    public static void main(String[] args) {
        //这种只能是1控制2，或者2控制1. 没法同时相互控制。 对顺序有要求
        T1 t1 = new T1();
        T2 t2 = new T2(t1);

        t1.start();
        t2.start();

    }
}

class T1 extends Thread{
    private boolean loop = true;

   /* private T2 t2;

    public T1() {
    }
    public T1(T2 t2){
        this.t2=t2;
    }*/

//提供set方法

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop){
            System.out.println((int)(Math.random()*100)); //[0,100)
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
//循环读取键盘
//键入字母后需要回车
//T2 通过构造器参数获取了T1的引用，持有了T1,进行控制
class T2 extends Thread{
    private boolean flag = true;
    private T1 t=null;//准备一个T1 引用
    private Scanner scanner = new Scanner(System.in);

    public T2(T1 t1) {
        this.t =t1;
    }

    @Override
    public void run() {
        while (flag){
            System.out.println("please input...");
            char c = scanner.next().toUpperCase().charAt(0);
            if (c =='Q'){
                //通知T1
                t.setLoop(false);
                System.out.println("已经输入Q,T1退出");

                //T2也退出
                break;
            }

        }

    }
}


