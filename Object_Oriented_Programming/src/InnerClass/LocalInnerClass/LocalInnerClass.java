package InnerClass.LocalInnerClass;

/**
 * @author wyl
 * @create 2020-08-28
 * @Description
 * /*
 * *  类的五大成员：属性、方法、构造器、代码块、内部类
 * *
 * *1、 内部类的最大特点就是可以直接访问私有属性，并且可以体现类与类之间的包含关系。
 * *   内部类的写法变化不大，变化主要在：作用域发生变化；使用形式发生变化
 * *
 * *2、 内部类分类
 * *    定义在外部类的局部位置上（比如方法内）：
 * *       1）局部内部类（有类名）
 * *       2）类名内部类（没有类名）
 * *    定义在外部类的成员位置上：
 * *       1）成员内部类（没用static修饰）
 * *       2）静态内部类（使用static）
 * *
 * *
 * *
 * *
 *
 *
 * @Version
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
         outer01.say();

         //成员内部类访问方式
        Outer05 outer05 = new Outer05();
        //方式一、(也可以引包，和引成员一样)：把成员内部类当作一个对象实例返回；成员内部类的一个对象实例时外部类的一个属性
        Outer05.InnerClass02 innerClass02 = outer05.new InnerClass02();
        innerClass02.say();
        //方式二、外部对象匿名（与方式一本质上是一样的）
        Outer05.InnerClass02 innerClass021 = new Outer05().new InnerClass02();
        innerClass021.say();
        //方式三、在成员内部类中写一个方法，用于返回InnerClass02对象
        Outer05.InnerClass02 innerClass022 = outer05.getInnerClass02();
        innerClass022.say();

    }
}

class Outer{//外部类

    public void f1(){
        class LocalInnerClass{//局部内部类：
            //局部内部类定义在外部类的局部位置，比如方法中，并且有类名；
            //可以直接访问 外部类的所有成员，包括私有的；
            //不能添加访问修饰符，因为它的地位就是一个局部变量。局部变量是不能使用修饰符修饰的。但可以使用final进行修饰（局部变量本身也可以使用final修饰）
            //作用域：在定义的方法或者代码块中，并且遵从向前引用原则；
            //如果外部类和内部类的成员重名时，内部类访问的话，默认遵循就近原则，如果想访问外部类的成员，则可以使用 外部类名.this.成员 访问
            // 可以借助于接口，通过内部类实现一个接口返回该接口引用的方式，配合动态绑定，可以使用接口接收，直接访问内部类中的方法。
        }
        class AAA extends LocalInnerClass{//内部类可以被继承

        }
    }

    class InnerClass{//成员内部类
        /*
        *  成员内部类是定义在外部类的成员位置，并且没有使用static修饰
        *   1、可以直接访问外部类的所有成员，包括私有的
        *   2、可以添加任意访问修饰符（public、protected、default、private），（类比成员）
        *
        * */
    }
}

class Other{
    //外部其它类
}




class Outer01{
    private int n1 = 10;
    private static String name = "yuye";


    public void say(){

        int n2 = 30;
        //局部内部类，相当于一个局部变量，作用域只是在say方法
        class LocalInner01{
            int n1 = 100;
            int n3 = 40;
            public void show(){
                System.out.println("show ok "+n1); //同名变量，就近原则
                System.out.println("show ok "+Outer01.this.n1+" hashcode:"+Outer01.this.hashCode()); //可以使用 外部类名.this.成员 访问外部类的成员
                                                                //这里的 Outer01.this实际上就是new出来的Outer01对象,可以查看hashcode
                //System.out.println(n2++); 报错，在内部类中使用局部变量，会默认将局部变量设置为final类型，不可更改。不在内部类中使用，可以正常更改，以防止局部变量的访问范围变大（涉及编译器）
            }
        }
        LocalInner01 localInner01 = new LocalInner01();//创建一个局部内部类对象
        localInner01.show();

    }

}

class Outer05{
    private int a =10;
    public String name ="hello";
    private void hi(){
        System.out.println("hi");
    }
    class InnerClass02{//成员内部类
        public void say(){
            System.out.println("111");
        }

    }

    //提供一个方法，返回一个InnerClass02对象
    public  InnerClass02 getInnerClass02(){
        return new InnerClass02();
    }
}
