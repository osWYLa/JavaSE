package Abstract.TemplateMethod;

/**
 * @author wyl
 * @create 2020-08-21
 * @Description 模板设计模式
 * @Version
 */

public class TemplatePattern{
    public static void main(String[] args) {

        //普通测试方法
        Sub1 sub1 = new Sub1();
        //动态绑定机制
            //sub1编译类型和运行类型都是Sub1
        sub1.caleTimes();//子类Sub1中没有重写caleTimes(),动态绑定到父类的方法。方法中调用的code()又动态绑定到子类重写的code()方法。

        Sub2 sub2 = new Sub2();
        sub2.caleTimes();

        //使用多态测试，参数
        test(new Sub1());
        test(new Sub2());
    }

    //使用多态测试，参数接受父类引用类型
    public static void test(Template template){
        template.caleTimes();
    }

}

//抽象类 体现模板设计模式
abstract class Template {
    //耗时代码不确定
    public abstract void code();

    //统计耗时时间代码确定
    public void caleTimes() {
        //统计当前时间距离1970.1.1 0：0：0的时间差，单位ms
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("耗时： " + (end - start) +" ms");
    }
}

class Sub1 extends Template {
    @Override
    public void code() {
        String string = "";
        for (int i = 0; i < 10000; i++) {
            string += "hello" + i;
        }
    }
}

class Sub2 extends Template{
    @Override
    public void code() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<1000000;i++){
            stringBuilder.append("hello"+i);
        }
    }
}
