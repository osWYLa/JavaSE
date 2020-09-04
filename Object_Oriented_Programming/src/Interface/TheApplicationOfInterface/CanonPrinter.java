package Interface.TheApplicationOfInterface;

/**
 * @author wyl
 * @create 2020-08-06
 * @Description
 * @Version
 */
public class CanonPrinter implements Printer{

    private void clean(){
        System.out.println("CanonPrinter clean");
    }

    @Override
    public void open() {
        System.out.println("CanonPrinter open");
    }

    @Override
    public void close() {
        System.out.println("CanonPrinter close");
    }

    @Override
    public void print(String s) {
        System.out.println("CanonPrinter print"+s);
    }
}
