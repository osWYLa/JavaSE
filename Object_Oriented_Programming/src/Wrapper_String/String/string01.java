package Wrapper_String.String;

/**
 * @author wyl
 * @create 2020-09-01
 * @Description
 *
 * @Version
 */
public class string01 {
    public static void main(String[] args) {
        //String 的两种创建方式
        //方式1：直接赋值：
            //先从常量池查看是否具有“hello”数据空间，如果有，直接指向；如果没有，则重新创建，然后指向，s最终指向的是常量池的空间地址。显然，如果字符串不同，常量池地址一定是不同的，不同对象；
        String s = "hello";
        //方式2：调用构造器：
            //调用构造器，先在堆中创建空间，里面维护了value属性，查找常量池是否具有“hello”数据空间，如果有，堆中的空间value属性指向常量池的“hello”,如果没有，在常量池重新创建，堆中的value指向常量池中创建的，
            //最后,引用指向堆
        String s1= new String("hello");

        String name ="111222333";
        System.out.println(name.substring(6));//从索引6开始，截取后面的所有字符
        System.out.println(name.substring(0,5));//[0,5) 一般语言都是左闭右开


    }
}
