package Thread.DeadLock;

/**
 * @author wyl
 * @create 2020-09-14
 * @Description 死锁 ：多个线程都占用了对方的锁资源，但不肯相让，导致死锁（需要避免）
 *
 *              //释放锁的时机：
 *              1）当前线程的同步方法、同步代码块执行完毕
 *              2）当前线程在同步代码块、同步方法中出现了未处理的Error或者Exception导致异常结束
 *              3）当前线程在同步代码块、同步方法中执行了线程对象的wait()方法，当前线程暂停，并释放锁；
 *
 *              //哪些情况下不会释放锁；
 *              1)线程执行同步代码块或者同步方法时，程序调用了Thread.sleep（）、Thread.yield()方法暂停当前线程的执行不会释放锁；
 *              2）线程执行同步代码块时，其他线程调用了该线程的suspend（）将线程挂起，该线程不会释放锁（同步监视器）
 *                  注意:应该尽量避免使用suspend（）和resume()来控制线程，方法不推荐使用
 *
 *
 * @Version
 */
public class DeadLockTest {
    public static void main(String[] args) {
        DeadLockDemo deadLockDemo = new DeadLockDemo(true);
        DeadLockDemo deadLockDemo1 = new DeadLockDemo(false);
        deadLockDemo.start();
        deadLockDemo1.start();
    }
}
class DeadLockDemo extends Thread{
    static Object o1= new Object();
    static Object o2= new Object();
    boolean flag;

    public DeadLockDemo(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (o1){
                System.out.println(Thread.currentThread().getName()+"进入1");
                synchronized (o2){
                    System.out.println(Thread.currentThread().getName()+"进入2");
                }
            }
        }else {
            synchronized (o2){
                System.out.println(Thread.currentThread().getName()+"进入3");
                synchronized (o1){
                    System.out.println(Thread.currentThread().getName()+"进入4");
                }
            }
        }
    }
}
