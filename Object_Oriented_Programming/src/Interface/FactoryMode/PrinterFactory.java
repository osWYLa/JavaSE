package Interface.FactoryMode;

import Interface.TheApplicationOfInterface.*;
/**
 * @author wyl
 * @create 2020-08-06
 * @Description
 * @Version
 */
public class PrinterFactory {
    //为调用方便，将此函数定义为static
    public static Printer getPrinter(int flag){
        Printer printer=null;
        switch(flag){
            case 1:
                printer = new HPPrinter();
                break;
            case 0:
                printer = new CanonPrinter();
                break;
            case 3:
                printer =null;
                break;
            default:
                break;
        }
        return printer;

    }
}
