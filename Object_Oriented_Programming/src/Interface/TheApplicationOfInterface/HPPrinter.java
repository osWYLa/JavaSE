package Interface.TheApplicationOfInterface;

/**
 * @author wyl
 * @create 2020-08-06
 * @Description
 * @Version
 */
public class HPPrinter implements Printer{
    @Override
    public void open() {
        System.out.println("HPPrinter open");
    }

    @Override
    public void close() {
        System.out.println("HPPrinter close");
    }

    @Override
    public void print(String s) {
        System.out.println("HPPrinter print"+s);
    }
}
