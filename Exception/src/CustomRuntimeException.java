/**
 * @author wyl
 * @create 2020-08-31
 * @Description
 * @Version
 */
public class CustomRuntimeException {
    public static void main(String[] args) {

        int age =300;
        if(!(age>=1 && age<=130)){
            throw new AException("一个异常");
        }


    }
}

class AException extends RuntimeException{
    public AException(String message) {
        super(message);
    }
}
