package Thread.Methods;

/**
 * @author wyl
 * @create 2020-09-14
 * @Description
 * @Version
 */
public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        T3 t3 = new T3();
        t3.start();

        //主线程
        for (int i=1;i<=20;i++){
            Thread.sleep(1000);
            System.out.println("hi "+i);
            if (i==5){
                System.out.println(Thread.currentThread().getName()+"让出CPU...等待"+t3.getName()+" 完成");
                t3.join();
                System.out.println("测试  。。"); //等join的子线程执行结束后执行
            }
        }


    }
}

class T3 extends Thread{
    @Override
    public void run() {
        try {
            for (int i =1;i<=10;i++){
                Thread.sleep(1000);
                System.out.println("hello world "+i);
            }

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(Thread.currentThread().getName()+" 处理完毕");
    }
}
