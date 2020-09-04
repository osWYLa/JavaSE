package ObjectTest.ToStringTest;

/**
 * @author wyl
 * @create 2020-08-18
 * @Description
 * @Version
 */
public class ToString {
    public static void main(String[] args) {
        Object o = new Object();
        //o.toString()为后面输出的是16进制的哈希值，o.hashCode()为10进制
        //getClass()获取到的是运行类型
        /*
        public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
    */
        System.out.println(o.toString()+" "+o.hashCode());

        Person person = new Person("yuye", 25, '男');
        System.out.println(person);
    }
}

class Person{
    private String name;
    private int age;
    private char gender;

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

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
