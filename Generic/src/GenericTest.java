import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author wyl
 * @create 2020-09-09
 * @Description
 * @Version
 */
public class GenericTest {
    public static void main(String[] args) {
        ArrayList<Dog> list = new ArrayList<>(); //编译器层面检查
        list.add(new Dog("A",12));
        list.add(new Dog("B",12));
        list.add(new Dog("C",12));
        //类型转换异常
       // list.add(new Cat("A",12)); //
        for (Object o :
                list) {
            Dog o1 = (Dog) o;
            System.out.println(o1);
        }
        for (Dog dog :
                list) {
            System.out.println(dog);
        }

        HashMap<String, Dog> stringDogHashMap = new HashMap<>(); //value传入Dog的子类也是可以的，支持多态
        stringDogHashMap.put("hello",new Dog("D",3));
        //stringDogHashMap.put(123,new Dog("D",3));



    }



}

class Dog {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Cat {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

}