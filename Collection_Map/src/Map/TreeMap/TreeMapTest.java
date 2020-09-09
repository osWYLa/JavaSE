package Map.TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author wyl
 * @create 2020-09-09
 * @Description
 * @Version
 */
@SuppressWarnings("ALL")
public class TreeMapTest {
    public static void main(String[] args) {
        //String -key String -value
        //要求key按照长度从小到大排序(针对键排序)
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() -((String)o2).length();
            }
        });
        treeMap.put("A","a");
        treeMap.put("AAAAAAAA","aaaaaaaa");
        treeMap.put("AAA","aaa");
        treeMap.put("AAAA","aaaa");
        treeMap.put("AAAAAA","aaaaaa");
        System.out.println(treeMap); //字符串重写toString


    }
}
