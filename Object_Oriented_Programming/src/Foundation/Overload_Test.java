package Foundation;

/**
 * @author wyl
 * @create 2020-08-05
 * @Description
 * @Version
 */
public class Overload_Test {
    public static void main(String[] args) {
        fun fun1 = new fun();
        fun1.f1();
        fun1.f1(3);
        fun1.f1(3, 4);
        Person person = new Person("yuye",25);


        String str = new String("content");
        String str1 = "content";

        System.out.println(str);
    }

}

class fun {
    public fun() {
        System.out.println("fun的无参构造函数");
    }

    //普通函数重载
    void f1() {
        System.out.println("普通函数f1无参构造函数");
    }

    void f1(int i) {
        System.out.println("普通函数f1的一个int参数的构造函数");
    }

    void f1(int i, int j) {
        System.out.println("普通函数f1的两个int参数的构造函数");
    }
}
class Person{
    public Person() {
        System.out.println("Person的无参数构造函数");
    }
    public Person(String s,int i){
        name=s;
        age =i;
        System.out.println("Person中含有两个参数的构造函数");
    }
    String name;
    int age;
}


