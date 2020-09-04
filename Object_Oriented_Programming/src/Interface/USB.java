package Interface;

/**
 * @author wyl
 * @create 2020-08-06
 * @Description  接口使用interface定义；java 8 中，允许接口有非抽象方法了，所以后面也有的把接口叫做接口类，因为也可以有一些实现了的方法；
 *                  默认为public
 * @Version
 */
public interface USB {

    //抽象方法,接口中的方法默认就是abstract
    void read() ;

    void write();

    //非抽象方法
    default void speed(){
        System.out.println("hello interface");
    }

    static int add(int a,int b){
        return  a+b;
    }

}

