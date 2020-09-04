package Interface.FactoryMode;

import Interface.TheApplicationOfInterface.Printer;

/**
 * @author wyl
 * @create 2020-08-06
 * @Description 简单静态工厂方法模式。生成子类对象时，并不是直接new，而是通过将生成对象的方法封装在PrinterFactory工厂类中，通过getPrinter方法获得实例。
 * @Version
 */
public class Test {
    public static void main(String[] args){
        int flag =1;
        Printer printer = PrinterFactory.getPrinter(1);
        printer.open();
        printer.print(" 工厂方法模式");
        printer.close();
    }
}
