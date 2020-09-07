package Collection.List.LinkedList;

import java.util.LinkedList;

/**
 * @author wyl
 * @create 2020-09-07
 * @Description
 * @Version
 */
@SuppressWarnings("ALL")
public class LinkedListMethods {
    public static void main(String[] args) {
        //方法API同于List
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < 10; i++) {
            linkedList.add("AA" + i);
        }
        for (Object o : linkedList) {
            System.out.println(o);
        }

    }
}
