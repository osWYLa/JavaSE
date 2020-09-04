package InnerClass.NoNameInnerClass;

/**
 * @author wyl
 * @create 2020-08-28
 * @Description  匿名内部类既有定义类的特征也有创建对象的特征。
 * @Version
 */
public class NonameInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04 {
    private int n1 = 10;

    public void method() {
        //匿名内部类用法：
        //第一种使用方法：
        //ia编译类型：IA ;运行类型（IA（）{}）,即ia的运行类型为实现了IA接口的一个子类（无名）
        IA ia = new IA() {
            @Override
            public void f1() {
                System.out.println("1111");
            }
        };
        ia.f1();//动态绑定

        //也可以这样写：
        new IA() {
            @Override
            public void f1() {
                System.out.println("1111");
            }
        }.f1();




        //第二种用法：直接基于类
            //
        B b = new B() {
            @Override
            public void test() {
                System.out.println("2222");
            }
        };
        b.test();

    }
}

interface IA {
    void f1();
}

class B {
    public B() {
    }

    public void test() {
        System.out.println("B test");
    }
}
