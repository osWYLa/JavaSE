package Inherit.AbstractTest;

import javax.naming.CannotProceedException;

/**
 * @author wyl
 * @create 2020-08-05
 * @Description
 * @Version
 */
public class Test {
    public static void main(String[] args) {
        int flag = 0;
        switch (flag){
            case 1:
                HPPrinterPro hpPrinterpro = new HPPrinterPro();
                hpPrinterpro.open();
                hpPrinterpro.print("hello hpprinter");
                hpPrinterpro.close();
                break;
            case 0:
                CanonPrinterPro canonPrinterpro = new CanonPrinterPro();
                canonPrinterpro.open();
                canonPrinterpro.print("hello canonPrinter");
                canonPrinterpro.close();
                break;
            default:
                break;
        }


    }
}
