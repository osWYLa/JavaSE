package PackageAndAccess;

import Inherit.AbstractTest.Printer;

/**
 * @author wyl
 * @create 2020-08-06
 * @Description
 *      ①public：公共权限（类、成员变量、成员函数）
 *               不在同一个包中，非public的成员变量和成员函数不能被其他调用；
 *               权限为public的成员变量和函数在被其他非同一包中的类调用时，写类全明或者使用import导入；
 *      ②private：私有权限（成员变量、成员函数、内部类）
 *                private修饰的变量函数只能在当前类中使用，不可跨包、跨类调用；
 *      ③default：默认权限-包级别访问权限（类、成员变量、成员函数）
 *                同一个包中可以任意使用；
 *                不在同一个包中，需要导入或写全称，由于未声明为public权限故不能跨包调用（首先这个类要是public的才行，其他包才能用new创建这个类的对象，至于里面哪些属性是可获取的，
 *                要看这个类中的属性和方法的access modifier-权限修饰符）
 *      ④protected: 不同于public，跨包使用时只用子类可以访问；（访问权限与继承，继承之后还要考虑所获得的访问权限是否支持访问、使用）
 *
 * @Version
 */
public class ClassName {
    //默认访问权限，并不要求类名与Java源文件相一致；
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.open();     //想通过该对象的引用调用对象的属性/方法，要求该属性是public（原类中如果没写access modified，为default默认访问权限）
    }
}
