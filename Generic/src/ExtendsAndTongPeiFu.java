import java.util.ArrayList;
import java.util.List;

/**
 * @author wyl
 * @create 2020-09-09
 * @Description 泛型的继承性和通配符
 *                  1)泛型不具备继承性；
 *                  2）<?> 支持任意泛型类型
 *                  3)<? extends A> 支持A类以及A类的子类，规定了泛型的上限；
 *                  4）<? super A>支持A类以及A类的父类，不限于直接父类，规定了泛型的下限
 * @Version
 */
public class ExtendsAndTongPeiFu {
    public static void main(String[] args) {
        Object o = "hello"; //可以，向上转型
       // List<Object> List = new ArrayList<String>();  //不允许，不能认为String是Object的子类，就推广到这个成立
        ArrayList<String> list000 = new ArrayList<>();
        ArrayList<Integer> list1111 = new ArrayList<>();

        System.out.println(list000.getClass());
        System.out.println(list1111.getClass()); //泛型存在类型擦除 这里都会是ArrayList类型

        //泛型通配符
        ArrayList<Object> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<AA> list2 = new ArrayList<>();
        ArrayList<BB> list3 = new ArrayList<>();
        ArrayList<CC> list4 = new ArrayList<>();

        //第一组测试 任意泛型
        printCollection1(list);
        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);

        //第二组测试 泛型上界，可以传入AA或者AA的子类
       // printCollection2(list);
      //  printCollection2(list1);
        printCollection2(list2);
        printCollection2(list3);
        printCollection2(list4);

        //第三组测试 泛型下界，支持AA类以及AA类的父类，不限于直接父类，规定了泛型的下限
        printCollection3(list);
       // printCollection3(list1);
        printCollection3(list2);
       // printCollection3(list3);
       // printCollection3(list4);


    }

    //支持任意泛型类型
    public static void printCollection1(List<?> c){
        for (Object obj :
                c) {
            System.out.println(obj);
        }
    }
    //规定了泛型上界，可以传入AA或者AA的子类
    public static void printCollection2(List<? extends AA> c){
        for (Object obj :
                c) {
            System.out.println(obj);
        }
    }
    //规定了泛型下界，支持AA类以及AA类的父类，不限于直接父类，规定了泛型的下限
    public static void printCollection3(List<? super AA> c){
        for (Object obj :
                c) {
            System.out.println(obj);
        }
    }

}

class AA {

}
class BB extends AA{

}
class CC extends BB{

}
