package Thread.CreatThread;

/**
 * @author wyl
 * @create 2020-08-07
 * @Description
 * @Version
 */
public class FirstThread extends Thread{
    @Override
    public void run() {
        for (int i=0;i<100;i++)
            System.out.println("FirstThread-->"+i);
    }
}
