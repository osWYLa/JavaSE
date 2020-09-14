/**
 * @author wyl
 * @create 2020-09-14
 * @Description
 * @Version
 */
public class test {
    public static void main(String[] args) {
       /* T t = new T();
        t.start();

        System.out.println("ok");
        for (int i=1;i<=10;i++){
            System.out.println("主线程"+i);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }*/

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("匿名对象runnable:...");
                }
            }
        }){
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("匿名对象thread:...");
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                System.out.println("hello");
            }
        }.start();


      /*  T1 t1 = new T1();
        Thread thread = new Thread(t1){
            @Override
            public void run() {
                System.out.println("jjj");
                while (true){
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("T1作为参数的，同时实现Thread里面的run方法:...");
                }
            }
        };
        thread.start();*/

        new Person().hi();

         new Person(){
            @Override
            public void hi() {
                System.out.println("你以为我会打印hi???");
            }
        }.hi();
    }
}
class T extends Thread{
    String name;
    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            System.out.println("子线程"+i);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i==5){
                System.out.println(name.length());
            }

        }
    }
}

class T1 implements Runnable{
    @Override
    public void run() {

        while (true) {

            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T1Runnable:....");
        }
    }
}

class Person{

    public Person() {
        System.out.println("无参构造");
    }

    public void hi(){
        System.out.println("hi");
    }
}
