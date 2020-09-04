package Interface.InterfacePoly;

/**
 * @author wyl
 * @create 2020-08-28
 * @Description
 *              多态（多态参数、多态数组）
 *              多态传递
 *
 * @Version
 */
public class test {
    public static void main(String[] args) {
        A1 a1 = new A1();
        IA ia = a1;
        B1 b1 = new B1();
        ia =b1; //多态传递，相当于B1也实现了IA接口。如果IA还有父接口，则B1可以赋值给所有父接口
    }

}
interface IA{
    void f1();
}
class A1 implements IA{

    @Override
    public void f1() {
        System.out.println("A1 f1");
    }

}
class B1 extends A1{
    
}
