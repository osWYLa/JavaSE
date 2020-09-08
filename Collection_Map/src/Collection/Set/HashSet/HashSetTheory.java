package Collection.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wyl
 * @create 2020-09-07
 * @Description
 * @Version
 */
@SuppressWarnings("ALL")
public class HashSetTheory {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("john");
        set.add("yuye");
        set.add("jack");
        set.add("hello");
        set.add("hello");
        set.add(null);
        System.out.println(set); //HashSet 重写了toString方法
    }
}
