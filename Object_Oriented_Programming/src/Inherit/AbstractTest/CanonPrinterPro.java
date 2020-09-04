package Inherit.AbstractTest;

/**
 * @author wyl
 * @create 2020-08-05
 * @Description
 * @Version
 */
 class CanonPrinterPro extends Printer{

   /* void close(){
        this.clean();
        super.close();
    }
*/
    //规范一点，使用注解，防止直接写将函数名写错，此处函数名写错就是一个新的函数，不会报错，但不是我们想要的结果
    @Override
    void close() {
        this.clean();
        super.close();
    }

    void clean(){
        System.out.println("clean");
    }


}
