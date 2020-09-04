package Inherit;

/**
 * @author wyl
 * @create 2020-08-05
 * @Description  多态性的体现，对象的转型：
 *                                   ①向上转型：（有继承关系的两个类，子类向上转型一定可以成功）
 *                                              将子类对象赋值给父类的引用；
 * @Version
 */
public class Transformation {
    public static void main(String[] args) {
        Person person = new Student(10); //向上转型（一定成功，Person和Student为继承关系）

        Student student = (Student)person; //向下转型

        person.name ="lisi";
        person.age=20;
       // person.grade=100; //错误，向上转型后父类的引用所调用的只能是子类从父类中继承过来的成员变量和成员方法（包括由子类复写的），而不能调用子类自己拥有的成员变量和成员函数。
        person.introduce();

    }
}
