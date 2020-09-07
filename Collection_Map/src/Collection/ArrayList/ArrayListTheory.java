package Collection.ArrayList;

import java.util.ArrayList;

/**
 * @author wyl
 * @create 2020-09-07
 * @Description
 * @Version
 */
@SuppressWarnings("ALL")
public class ArrayListTheory {
    public static void main(String[] args) {
        System.out.println(" ");

        //调用无参构造函数，初始ele为0
       /* ArrayList list = new ArrayList();
        for (int i=1;i<=10;i++){//第一次添加，ele需要扩容为10
            list.add("AA"+i);
        }
        for (int i=1;i<=5;i++){
            list.add("CC"+i);
        }
        list.add("AA");
        list.add("BB");
        list.add(null);
        for (Object o :
                list) {
            System.out.println(o);
        }*/


        //有参构造器，初始容量为 initialCapacity
            //扩容直接变成每次之前的1.5倍
        ArrayList list1 = new ArrayList(8);
        for (int i=1;i<=10;i++){
            list1.add("AA"+i);
        }
        for (int i=1;i<=5;i++){
            list1.add("CC"+i);
        }
        list1.add("AA");
        list1.add("BB");
        list1.add(null);
        for (Object o :
                list1) {
            System.out.println(o);
        }


    }
}
