package JavaException;

/**
 * @author wyl
 * @create 2020-08-07
 * @Description  异常可以分为：运行时异常和编译时异常；或者，UnCheck\Check异常，其中，UnCheck包括运行时异常及其子类。
 *               创建异常的基本父类：Throwable，有两个直接子类，Exception和Error。
 *               try..放置有可能出现异常的代码，如果出现异常进入catch处理；
 *               catch...处理异常代码
 *               finally...无论是否有异常产生都会被处理（异常的出口）；通常用来释放资源
 * @Version
 */
public class Test {
    public static void main(String[] args) {
        int i=1/0;// java.lang.ArithmeticException
        System.out.println(i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) { //e 为虚拟机产生的一个异常类对象，可以在catch中使用这个对象打印异常的栈追踪信息。
            e.printStackTrace();
        }
    }
}
