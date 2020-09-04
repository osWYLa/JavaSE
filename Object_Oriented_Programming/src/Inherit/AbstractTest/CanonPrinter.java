package Inherit.AbstractTest;

/**
 * @author wyl
 * @create 2020-08-05
 * @Description
 * @Version
 */
public class CanonPrinter {
    void open(){
        System.out.println("open");
    }
    void print(String s){
        System.out.println("print-->"+s);
    }
    void close(){
        this.clean();
        System.out.println("close");
    }
    void clean(){
        System.out.println("clean");
    }
}
