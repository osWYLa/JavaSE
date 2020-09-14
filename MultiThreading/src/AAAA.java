/**
 * @author wyl
 * @create 2020-09-14
 * @Description
 * @Version
 */
public class AAAA {
    public static void main(String[] args) {
        A f = new A() {
            @Override
            public void f() {
                System.out.println("F");
            }
        };
        B b = new B();


        System.out.println(f.getClass());
        System.out.println(b.getClass());
    }
}
class A {
     public void f(){
         System.out.println("f...");
     }
}

class B extends A{

}

