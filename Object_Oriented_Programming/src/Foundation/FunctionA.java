package Foundation;

/**
 * @author wyl
 * @create 2020-08-05
 * @Description
 * @Version
 */
public class FunctionA {
    //构造函数：无返回值类型；名字必须与类名相同
    //若在此无参构造函数前加上”void “,则这个函数就不再是构造函数了，只是一个普通的函数。可以通过新建对象进行调用，并不会在创建对象时调用。
    public FunctionA() {
        System.out.println("Constructor构造函数");
    }

    void f1() {
        System.out.println("无参数f1");
    }

    void f1(int i) {
        System.out.println("一个参数f1");
    }

    void f1(int i, int j) {
        System.out.println("两个参数f1");
    }

}
