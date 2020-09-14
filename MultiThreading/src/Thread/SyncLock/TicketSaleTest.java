package Thread.SyncLock;

/**
 * @author wyl
 * @create 2020-09-13
 * @Description  //重复票，空票还在卖问题
 * @Version
 */
public class TicketSaleTest {
    public static void main(String[] args) {
        SaleTicket saleTicket = new SaleTicket();
        saleTicket.start();
        SaleTicket saleTicket1 = new SaleTicket();
        saleTicket1.start();
        SaleTicket saleTicket2 = new SaleTicket();
        saleTicket2.start();

    }
}

class SaleTicket extends Thread{
    private static int ticketNum = 100;

    @Override
    public void run() {
        while (true){
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
