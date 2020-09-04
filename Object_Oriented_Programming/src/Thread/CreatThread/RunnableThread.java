package Thread.CreatThread;

/**
 * @author wyl
 * @create 2020-08-07
 * @Description
 * @Version
 */
public class RunnableThread implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++)//线程体
            System.out.println("RunnableThread-->"+i);
    }
}
