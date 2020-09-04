package Inherit.AbstractTest.Test4AbstrctPrinter;

/**
 * @author wyl
 * @create 2020-08-05
 * @Description
 * @Version
 */
abstract public class AbstractPrinter {
    void open(){
        System.out.println("open");
    }
    void close(){
        System.out.println("close");
    }
    abstract void print();

}
