package Collection.List;


import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;


/**
 * @author wyl
 * @create 2020-09-06
 * @Description
 * @Version
 */
@SuppressWarnings("ALL")
public class LinkedListTest {
    public static void main(String[] args) {
        //LinkedList方法几乎和ArrayList相同
        List list = new LinkedList();
        list.add("java");
        list.add("hello");
        System.out.println(list);
        //remove
        //set
        //遍历
            //迭代器遍历
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("================");
            //增强For遍历
        for (Object o :
                list) {
            System.out.println(o);
        }
        
        System.out.println("================");
            //普通for
        for (int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
