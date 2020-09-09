package Collection.Set.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author wyl
 * @create 2020-09-09
 * @Description TreeSet 可以指定规则
 * @Version
 */
@SuppressWarnings("ALL")
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() {
            //"jack","tom","george"
            //要求按名字长度从小到大排序存储
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() -((String)o2).length();
            }
        });

        treeSet.add("jack");
        treeSet.add("geroge");
        treeSet.add("tom");
        System.out.println(treeSet);
    }
}
