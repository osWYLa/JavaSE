package Foundation;

/**
 * @author wyl
 * @create 2020-08-05
 * @Description ①this可以区分成员变量和与成员变量同名的参数；
 *              ②在构造器中this可以调用其他构造函数,要求this()是第一条语句。
 *              ③this可以调用本类的方法；
 *
 *              关于static：static关键字将类的成员变量变成类相关而非类实例相关；
 *                         static可以修饰内部类，但不可修饰外部类；
 *                         静态部分在加载时就会创建，所以，静态不可以调用非静态，非静态可以调用静态。
 *              静态代码块：在装载这个类的时候执行。
 *                        （类的大概执行步骤：装载至内存（虚拟机）、解释、执行）
 * @Version
 */
public class KeyWordThis {

    public static void main(String[] args) {
        Person_this.talk_static("yuye");

        KeyWordThis keyWordThis = new KeyWordThis();
        keyWordThis.m2();


        //静态方法，使用类名直接调用
        Person_this.havefun();
        Person_this person_this = new Person_this();
        person_this.name = "Lisi";
        person_this.talk("ZhangSan");


        Person_this person_this1 = new Person_this("yuye", 20, "AnhuiWuhu");
        System.out.println("my name is qqqqq" + person_this1.name + ",my age is " + person_this1.age + ",my address is " + person_this1.address);
        System.out.println(person_this1);//Person_this{name='yuye', age=20, address='AnhuiWuhu'} 重写toStrig方法


        Person_this person_this2 = new Person_this("007", 45);
        System.out.println("my name is " + person_this2.name + ",my age is " + person_this2.age + ",my address is " + person_this2.address);

        Person_this wyl = new Person_this("wyl");
        System.out.println("my name is " + wyl.name + ",my age is " + wyl.age + ",my address is " + wyl.address);


    }

    void fun(){
        System.out.println("hi fun");
    }

    void m2(){
        this.fun();  //可以访问本类的
        System.out.println("m2");
    }

}



class Person_this {
     String name;

    Integer age;

    String address;

    @Override
    public String toString() {
        return "Person_this{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    //构造函数重载，若自己实现了构造函数的重载，Java将不会再自动生成调用无参构造函数
    public Person_this() {
        System.out.println("Person_this的无参构造函数");
    }

    public Person_this(String name) { //不对int类型的值赋值，默认初始值为0，要注意。
        this();
        this.name = name;
        System.out.println("Person_this的一个参数构造函数");
    }

    public Person_this(String name, int age) {
        this(name);
        this.age = age;
        System.out.println("Person_this的两参数构造函数");
    }

    public Person_this(String name, int age, String address) {
        this(name, age);
        this.address = address;
        System.out.println("Person_this的三参数构造函数");
    }

    void talk(String name) {
        System.out.println(this.name);
    }
    static void talk_static(String name){
        System.out.println(name);
    }



    static void havefun() {
        System.out.println("have Foundation.fun");
    }
}
