package Inherit;

/**
 * @author wyl
 * @create 2020-08-05
 * @Description 函数的复写 override：（修改继承过来的父类成员方法）
 *                                ①在具有父子关系的两个类中 VS 函数重载在一个类中；
 *                                ②父类和子类各有一个函数，这两个函数的定义（返回值类型、函数名和参数列表）完全相同 VS 函数重载要求函数名相同，参数列表不同，返回值类型可以相同。
 * @Version
 */
public class OverrideTest {
    public static void main(String[] args) {
        Student student = new Student(20);
        System.out.println(student.grade);
        student.introduce();
    }
}
