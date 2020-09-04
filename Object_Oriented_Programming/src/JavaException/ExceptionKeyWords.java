package JavaException;

/**
 * @author wyl
 * @create 2020-08-07
 * @Description  和异常相关的两个关键字：throw（抛出异常）和throws（声明异常，在异常产生后不由产生这个异常的函数处理，而由调用这个函数进行处理）
 *
 *
 *               若生成的是Check类型的异常对象，为使编译通过，有两种方法：
 *               ①使用try...catch...finally捕捉处理异常；
 *               ②对异常进行声明：
 *
 *
 * @Version
 */
public class ExceptionKeyWords {
    public static void main(String[] args)  {
        User user = new User();
        try {
            user.setAge(-20);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class User{
    private int age;
    public void setAge(int age) throws Exception{
        if(age<0)
        {
            // java.lang.RuntimeException
            RuntimeException runtimeException = new RuntimeException("年龄不能为负数");//RuntimeException UnCheck

            //java.lang.Exception
            Exception exception = new Exception("年龄不能为负数啊");//Check

           /* try {
                throw exception;
            } catch (Exception e) {
                e.printStackTrace();
            }*/
            throw exception;

            //throw runtimeException;

        }


        this.age=age;
        System.out.println(age);
    }
}