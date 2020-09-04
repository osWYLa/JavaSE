package ObjectTest.EqualsTest;

/**
 * @author wyl
 * @create 2020-08-11
 * @Description
 * @Version
 */
public class test01 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1==s2); //不是同一个对象，false
        System.out.println(s1.equals(s2));//重写了父类的equals()
    }
}
