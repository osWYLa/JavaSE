package Abstract;

/**
 * @author wyl
 * @create 2020-08-20
 * @Description 抽象类在多态数组和多态参数上的使用
 *              同时也支持向上向下转型
 * @Version
 */
public class AbstractClass {
    public static void main(String[] args) {
        //一个类继承了一个抽象类，该子类的对象可以赋值给 抽象类的引用
        Animal animal = new Cat("Tom");
        animal = new Dog("hello");

        //多态数组
        Animal animal1[] = {new Cat("1"),new Dog("2")};

        //多态参数测试
        Cat cat = new Cat("123");
        test(cat);
    }
    //多态参数
    public static void test(Animal animal){ //这里区别于之前，是没有办法传入Animal对象的，因为抽象类不能实例化
        animal.eat(); //动态绑定
    }



}

abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }

    abstract void eat();

}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Cat eat ...");
    }
}

class  Dog extends  Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Dog eat ...");
    }
}