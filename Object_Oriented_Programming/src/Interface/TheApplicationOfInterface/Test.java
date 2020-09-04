package Interface.TheApplicationOfInterface;

/**
 * @author wyl
 * @create 2020-08-06
 * @Description
 * @Version
 */
public class Test {
    public static void main(String[] args) {

        Printer printer =null;
        int flag =1;
        switch(flag){
            case 1:
                printer = new HPPrinter();
                break;
            case 0:
                printer =new CanonPrinter();
                break;
            default:
                break;
        }
        printer.open();
        printer.print("   hello interface");
        printer.close();


    }
}
