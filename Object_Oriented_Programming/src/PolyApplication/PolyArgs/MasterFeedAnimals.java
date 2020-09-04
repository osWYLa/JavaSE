package PolyApplication.PolyArgs;

/**
 * @author wyl
 * @create 2020-08-11
 * @Description
 * @Version
 */
public class MasterFeedAnimals {
    public static void main(String[] args) {
        Object o = new Object();
        Dog dog = new Dog("大黄");
        cat cat = new cat("花猫");
        Fish fish = new Fish("鱼");
        Bone bone = new Bone("骨头");


        Master yuye = new Master("yuye");
        yuye.feed(dog,bone);
    }
}

class Food{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food(String name) {
        this.name = name;
    }
}

class Fish extends Food{
    public Fish(String name) {
        super(name);
    }
}
class Bone extends Food{
    public Bone(String name) {
        super(name);
    }
}


class Animal{
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
}
class cat extends Animal{
    public cat(String name) {
        super(name);
    }
}
class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
}


class Master{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Master(String name) {
        this.name = name;
    }

    //使用参数多态
    //否则对于feed方法需要很多的方法重载，出现方法爆炸
    public void feed(Animal animal,Food food){
        System.out.println("主人 "+name+" 给 "+animal.getName()+" 喂 "+food.getName());
    }
}
