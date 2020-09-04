package Interface.InterfaceVSExtends;

/**
 * @author wyl
 * @create 2020-08-28
 * @Description
 *              接口和继承解决的问题不同:
 *              继承的价值主要在于：解决代码的重用性和可维护性；
 *              接口的价值主要在于：设计，设计号各种规范（方法），让其他类去实现这些方法；
 *
 *              接口比继承更灵活，继承（is  a 的关系），接口（like  a 的关系）；
 *
 *              一定程度上的代码解耦；
 *
 *
 * @Versn
 */
public class Test {
    public static void main(String[] args) {

        //通过继承和实现接口，这里的多态可以很复杂，LittleMonkey对象可以赋值给LittleMonkey、Monkey、Bird able、IFishable
        LittleMonkey littleMonkey = new LittleMonkey("小猴子");
        littleMonkey.flying();

        test01(littleMonkey);

        test02(littleMonkey);
    }
    public static void test01(Monkey m){
        m.climbing();
    }
    public static void test02(IFishable f){
        f.swimming();
    }
}

class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void climbing() {
        System.out.println(getName() + " climbing");
    }
}


interface IFishable {
    void swimming();
}
interface Birdable{
    void flying();
}

//这个时候，如果想要扩展LittleMonkey的功能，由于不支持多继承，所以只能使用接口去做，继承Monkey后同时可以实现其他接口，实现功能的扩展
class LittleMonkey extends Monkey implements IFishable,Birdable {
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName()+" swimming");
    }

    @Override
    public void flying() {
        System.out.println(getName()+" flying");
    }
}
