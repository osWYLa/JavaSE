package InnerClass.ApplicationInnerNoNameClass;

/**
 * @author wyl
 * @create 2020-08-28
 * @Description 匿名内部类最佳实践——当作实参直接传递，简洁高效
 * @Version
 */
public class ApplicationOfNonameInnerClass {
    public static void main(String[] args) {

        //当作实参进行传递
        show(new AA() {   //动态绑定
            @Override
            public void f1() {
                System.out.println("可以随时修改实现AA接口的内容");
            }
        });
    }

    public static void show(AA aa){
        aa.f1();
    }
}
interface  AA{
    void f1();
}
