package Thread;




/**
 * @author wyl
 * @create 2020-09-13
 * @Description
 * @Version
 */
public class Thread01 {
    public static void main(String[] args) {
        MyThread01 myThread01 = new MyThread01();
        myThread01.start();

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

class MyThread01 extends Thread{
    @Override
    public void run() {//run方法
        try {

            for (int i=0;i<99;i++){
                System.out.println("继承Thread创建子线程"+i);
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
