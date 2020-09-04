package ObjectTest.HashcodeTest;

/**
 * @author wyl
 * @create 2020-08-18
 * @Description
 *             hashCode 方法
 * @Version
 */
public class HashCode {
    public static void main(String[] args) {
        Object o = new Object();
        Object o1 = new Object();
        System.out.println(o.hashCode());
        System.out.println(o1.hashCode()); //两个引用，如果指向不同对象，则哈希值 是不一样的（不绝对）

        Object o2 = o;
        System.out.println(o2.hashCode()); //两个引用如果指向的是同一个对象，则哈希值一定是一样的

    }
}
