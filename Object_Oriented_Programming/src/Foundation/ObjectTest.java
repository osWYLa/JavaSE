package Foundation;

/**
 * @author wyl
 * @create 2020-08-05
 * @Description
 * @Version
 */
public class ObjectTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.age=10;
        dog.color="black";
        dog.name="WangCai";

        Dog dog1 = new Dog();

        //匿名对象
        new Dog().jump();

        System.out.println(dog.age+dog.name+dog.color);

        dog.jump();
    }
}
class Dog{
    int age;
    String name;
    String color;
    void jump(){
        System.out.println("jumping");
    }
}
