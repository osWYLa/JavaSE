package Inherit.AbstractTest.Test4AbstrctPrinter;

import Inherit.AbstractTest.Test4AbstrctPrinter.AbstractPrinter;

/**
 * @author wyl
 * @create 2020-08-05
 * @Description
 * @Version
 */
public class CanonPrinterExtendsAbstractPrinter extends AbstractPrinter {
    @Override
    void print() {
        System.out.println("使用针式");
    }

    @Override
    void close() {
        this.clean();
        super.close();
    }
    void clean(){
        System.out.println("clean");
    }
}
