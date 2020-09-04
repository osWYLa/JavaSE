/**
 * @author wyl
 * @create 2020-08-31
 * @Description
 * @Version
 */
public class CustomException {
    public static void main(String[] args) {
        AgeException ageException = null;
        int age =200;
        try {
            if(!(age >=1 && age <= 130 )){
                 ageException= new AgeException("异常。。。。不在范围内");  //抛出一个自定义异常对象
                throw ageException;
            }
        } catch (AgeException e) {
            System.out.println(e.hashCode()+"sss"+e.getMessage()); //接受刚才抛出的异常对象，是同一个对象
        }
        if (ageException != null)
        System.out.println(ageException.hashCode());
    }
}

//自定义异常(继承Exception是编译型异常)
class AgeException extends Exception{
    //一般重写构造器


    public AgeException(String message) {
        super(message);
    }
}