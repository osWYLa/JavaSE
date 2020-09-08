package Collection.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author wyl
 * @create 2020-09-07
 * @Description
 * @Version
 */
@SuppressWarnings("ALL")
public class HashSetTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        //特点
        //添加顺序和取出的顺序不一致，但是取出的顺序是固定的；
        //不可以添加重复对象，有一个前提，某个类重写了hashCode和equals方法（只是提供这样一种机制，但是具体需要自己实现，这里只是巧合。
        //因为String已经重写了HashCode和equals）;




     //   set.add(new Dog("tian"));
        set.add("john");
        set.add("yuye");
        set.add("jack");
        set.add("hello");
        set.add("hello");
        set.add(null);
        for (int i =0;i<90;i++){
            set.add(new Dog("tian"));
        }
        System.out.println(set); //HashSet 重写了toString方法

        //set的遍历
        //迭代器遍历
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=========");
        //增强for遍历
        for (Object o :
                set) {
            System.out.println(o);
        }

    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
