package Inherit.AbstractTest;

/**
 * @author wyl
 * @create 2020-08-05
 * @Description
 * @Version
 */
public class Printer {
    public void open(){
        System.out.println("open");
    }
    void print(String s){
        System.out.println("print-->"+s);
    }
    void close(){
        System.out.println("close");
    }
}
