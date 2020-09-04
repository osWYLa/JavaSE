package ObjectTest.EqualsTest;

/**
 * @author wyl
 * @create 2020-08-18
 * @Description
 * @Version
 */
public class test02 {
    public static void main(String[] args) {
        Person person = new Person("yuye", 12, '男');
        Person person1 = new Person("yuye", 12, '男');

        Person teacher2 = new Teacher("yuye", 12, '男');

        System.out.println(person.equals(person1));
        System.out.println(person.equals(teacher2));


    }
}


class Person {
    @Override
    public boolean equals(Object obj) {
        //首先判断传入对象是否就是调用equals方法的对象，是同一个对象返回真
        if (this == obj)
            return true;
        //判断传入的obj是否是Person类型或Person子类，不是则返回false
        if (!(obj instanceof Person))  //不合理
            return false;

        if( obj.getClass() != Person.class)
            return false;
        //为取得obj中的属性，进行向下转型 （这里的Person继承自Object,equals 方法接口传入的是Object类型，这里实际就已经是向上转型了）
        Person person = (Person) obj;
        //this可以去掉，因为并没重名
        return this.getName().equals(person.getName()) && this.getAge() == person.getAge() && this.getGender() == person.getGender();
    }

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

class Teacher extends Person{

    public Teacher(String name, int age, char gender) {
        super(name, age, gender);
    }

}
