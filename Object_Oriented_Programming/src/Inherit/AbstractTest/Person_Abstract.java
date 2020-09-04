package Inherit.AbstractTest;

/**
 * @author wyl
 * @create 2020-08-05
 * @Description 生成子类对象时一定要父类的构造函数,对于抽象函数来说也是如此。
 * @Version
 */
abstract public class Person_Abstract {
    public Person_Abstract(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person_abstract 两个参数构造函数");
    }

    String name;
    int age;
    void introduce(){
        System.out.println("my name is "+this.name+",my age is "+this.age);
    }
    //有抽象函数，必须是抽象类
    abstract void eat();

}
