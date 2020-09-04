package CommonlyUsedClass;

/**
 * @author wyl
 * @create 2020-09-01
 * @Description
 * @Version
 */
public class MathTest {
    public static void main(String[] args) {
        //求整数a,b间的一个数
        int a = 1;
        int b = 6;
        int num = (int)(Math.random()*(b-a+1)+a);
        //
            //Math.random() ==>[0,1)
            //1、 Math.random()*6  ==>[0,6)
            //2、 Math.random()*(b-a+1)+a ==> [1,7)
            //3、 int 取整 ==>[1,6]


    }
}
