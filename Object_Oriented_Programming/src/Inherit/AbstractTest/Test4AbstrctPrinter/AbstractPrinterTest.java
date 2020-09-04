package Inherit.AbstractTest.Test4AbstrctPrinter;



/**
 * @author wyl
 * @create 2020-08-05
 * @Description
 * @Version
 */
public class AbstractPrinterTest {
    public static void main(String[] args) {
        int flag = 0;
        switch (flag){
            case 1:
                CanonPrinterExtendsAbstractPrinter canonPrinterExtendsAbstractPrinter = new CanonPrinterExtendsAbstractPrinter();
                canonPrinterExtendsAbstractPrinter.open();
                canonPrinterExtendsAbstractPrinter.print();
                canonPrinterExtendsAbstractPrinter.close();
                break;
            case 0:
                HPPrinterExtendsAbstractPrinter hpPrinterExtendsAbstractPrinter = new HPPrinterExtendsAbstractPrinter();
                hpPrinterExtendsAbstractPrinter.open();
                hpPrinterExtendsAbstractPrinter.print();
                hpPrinterExtendsAbstractPrinter.close();
                break;
            default:
                break;
        }
    }
}
