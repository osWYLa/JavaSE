package InnerClass.AnonymousInnerClass;

/**
 * @author wyl
 * @create 2020-08-07
 * @Description
 * @Version
 */
public class Test {
    public static void main(String[] args) {
        A a = new AImplement();
        a.doSomething();

        B b = new B();
        b.fun(a);
    }
}
