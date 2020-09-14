package Thread.SyncLock;

/**
 * @author wyl
 * @create 2020-09-14
 * @Description
 * @Version
 */
public class TicketPro2 {
    public static void main(String[] args) {
        SaleTicketProo2 saleTicketProo2 = new SaleTicketProo2();
        Thread thread = new Thread(saleTicketProo2);
        Thread thread1 = new Thread(saleTicketProo2);
        Thread thread2 = new Thread(saleTicketProo2);
        thread.start();
        thread1.start();
        thread2.start();
    }
}
class SaleTicketProo2 implements Runnable{
    private static int ticketNum = 100;
    private boolean falg = true;
    @Override
    public void run() {
        while (true){
            if (ticketNum<=0){
                break;
            }
            //对下面的代码块加上一个互斥锁对象
          /*  synchronized (this){ //this 锁不住，有三个对象，可以使用SaleTicketProo2.class 对象 ，这个Class对象只有一个，反射时说过。
               可以将extends方式改成implements方式.体现了继承和实现接口的区别
                if (ticketNum<=0){
                    System.out.println(Thread.currentThread().getName()+"票已售罄"+" "+ticketNum);
                    break;
                }
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }



                ticketNum--;
                System.out.println(Thread.currentThread().getName()+"售出一张票"+" "+ticketNum);

            }*/
             sale();
        }

    }


    private synchronized void sale(){ //方法上锁(使用继承Thread也可以)
        if (ticketNum<=0){
          //  System.out.println(Thread.currentThread().getName()+"票已售罄"+" "+ticketNum);
            return ;
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        //ticketNum--;
        System.out.println(Thread.currentThread().getName()+"售出一张票"+" "+(--ticketNum));
        //return true;
    }

    public synchronized void f1(){ //在非静态方法上加锁，加在this上

    }
    public static synchronized void f2(){ //在静态方法上加锁，加在当前类的Class对象上

    }


}