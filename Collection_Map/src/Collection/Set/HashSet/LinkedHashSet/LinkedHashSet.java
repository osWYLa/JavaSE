package Collection.Set.HashSet.LinkedHashSet;

import java.util.Set;

/**
 * @author wyl
 * @create 2020-09-08
 * @Description
 * @Version
 */
@SuppressWarnings("ALL")
public class LinkedHashSet {
    public static void main(String[] args) {
      Set linkedHashSet = new java.util.LinkedHashSet();
      linkedHashSet.add("yuye");
      linkedHashSet.add("yuye"); //String 已经重写了hashCode 和equals
      linkedHashSet.add("Tom");
      linkedHashSet.add("java");
      linkedHashSet.add("SOS");

        System.out.println(linkedHashSet); //有序

    }
}
