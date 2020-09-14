package Thread.SyncLock;

/**
 * @author wyl
 * @create 2020-09-14
 * @Description 代码上加锁
 * @Version
 */
public class TicketPro1 {

    public static void main(String[] args) {
        SaleTicketPro01 saleTicket = new SaleTicketPro01(); //implements只需要一个这个对象

        /*SaleTicketPro01 saleTicket1 = new SaleTicketPro01();

        SaleTicketPro01 saleTicket2 = new SaleTicketPro01();
        saleTicket1.start();
        saleTicket.start();
        saleTicket2.start();*/

        //改换使用implements方式
        Thread thread = new Thread(saleTicket);
        thread.start();
    }
}

class SaleTicketPro01 implements Runnable{
//class SaleTicketPro01 extends Thread{
    private static int ticketNum = 100;

    @Override
    public void run() {
        while (true){
            //对下面的代码块加上一个互斥锁对象
            synchronized (this){ //this 锁不住，有三个对象。可以将extends方式改成implements方式.体现了继承和实现接口的区别
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

        }
        }

    }
}
