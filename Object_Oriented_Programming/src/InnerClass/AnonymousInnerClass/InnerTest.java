package InnerClass.AnonymousInnerClass;

/**
 * @author wyl
 * @create 2020-08-07
 * @Description
 * @Version
 */
public class InnerTest {
    public static void main(String[] args) {
        B b = new B();
        b.fun(new A() {
            @Override
            public void doSomething() {
                System.out.println("匿名内部类");
            }
        });
    }
}
