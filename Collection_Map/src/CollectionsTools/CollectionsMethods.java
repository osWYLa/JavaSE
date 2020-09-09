package CollectionsTools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author wyl
 * @create 2020-09-09
 * @Description
 * @Version
 */
@SuppressWarnings("ALL")
public class CollectionsMethods {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);

        //reverse(list) 反转List中元素的顺序
        Collections.reverse(list);
        System.out.println(list);
        //list 元素随机排序
        Collections.shuffle(list);
        //sort排序(默认排序，这个应该会找到String的compareTo)
        Collections.sort(list);
        //指定排序规则
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return ((String)o1).length()- ((String)o2).length();
            }
        });
        System.out.println(list);
        //交换swap
        Collections.swap(list,0,2);
        System.out.println(list);

        //copy(必须先初始化好空间)
        List dest = new ArrayList();
        for (int i =0;i<list.size();i++){
            dest.add("");
        }
        Collections.copy(dest,list);
        System.out.println("dest ="+dest);


    }
}
