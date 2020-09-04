package CommonlyUsedClass;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author wyl
 * @create 2020-09-03
 * @Description
 * @Version
 */
public class BigNum {
    public static void main(String[] args) {
        //保存一个巨大的数
      //  long num = 99999999999999999999999999999999L;
        BigInteger bigInteger = new BigInteger("99999999999999999999999999999"); //使用字符串处理
        System.out.println(bigInteger);
        BigInteger bigInteger2 = new BigInteger("1"); //使用字符串处理

        System.out.println(bigInteger.add(bigInteger2));
        System.out.println(bigInteger.subtract(bigInteger2));
        System.out.println(bigInteger.multiply(bigInteger2));
        System.out.println(bigInteger.divide(bigInteger2));

        //存很精密的小数
        double d = 999999999999999999999999999999.999999999999999999999d;
        System.out.println(d); //精度丢失


        BigDecimal bigDecimal = new BigDecimal("99999999999999999999999999999999999999999999999.999999999999999999999");
        BigDecimal bigDecimal1 = new BigDecimal("99999999999999999999999999999999999999999999999.111111111111111111");
        System.out.println(bigDecimal.add(bigDecimal1));
        //除法 需要注意，循环小数需要指定精度
        System.out.println(bigDecimal.divide(bigDecimal1,BigDecimal.ROUND_CEILING));

    }
}
