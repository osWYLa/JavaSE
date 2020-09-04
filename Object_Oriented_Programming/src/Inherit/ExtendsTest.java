package Inherit;
/**
 * @author wyl
 * @create 2020-08-05
 * @Description java中只支持单继承;
 *             子类实例化：使用new调用子类构造函数，生成子类对象时，一定要调用合适的父类构造函数，若子类中没有使用super指定，则编译器会自动加上
 * @Version
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Student student = new Student();  //子类继承得到父类中的属性和方法。调用之类的构造函数之前必须调用父类的构造函数
        student.age=20;
        student.name="yuye";
        student.eat();
        student.introduce();
    }
}

