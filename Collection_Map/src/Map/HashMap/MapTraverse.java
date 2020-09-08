package Map.HashMap;

import java.util.*;

/**
 * @author wyl
 * @create 2020-09-08
 * @Description
 * @Version
 */
@SuppressWarnings("ALL")
public class MapTraverse {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("Tom", "汤姆");
        map.put("Jack", "杰克");
        map.put("Yuye", "雨夜");

        System.out.println(map);
        //遍历
        //方式1：取出所有的key（key存放在Set中），再通过key取value
        Set keySet = map.keySet();
        System.out.println(keySet);
            //迭代器
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()){
            Object key = iterator.next();
            System.out.println("key:"+key+"--value:"+map.get(key));
        }
        System.out.println("================");
            //增强for
        for (Object key :
                keySet) {
            System.out.println("key:"+key+"--value:"+map.get(key));
        }
        System.out.println("================");
        //方式2：整个entry（key-value）一起取出放入集合
            //迭代器：
        Set entrySet = map.entrySet();
        System.out.println(entrySet);
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext())
        {
           /* Object obj = iterator1.next();
            System.out.println(obj.getClass());//HashMap$Node*/

            //由于Node是HashMap的静态内部类，无法直接转；很漂亮的是，通过Entry接口可以实现，本身Node也是实现类Entry接口
            //使用Entry接口接收,Node 实现了Entry接口，有其中的方法
            Map.Entry node = (Map.Entry) iterator1.next();
            System.out.println(node.getKey()+":::"+node.getValue());
        }
        System.out.println("================");
            //增强for
        for (Object obj:entrySet) {  // entrySet  增强for中还是通过next返回，返回就是一个Object
                                        //obj的编译类型就是Object，运行类型是HashMap$Node
                                        //Node 是内部类，使用实现的接口接收
            Map.Entry node = (Map.Entry) obj; //obj向下转型，实际运行类型还是HashMap$Node，使用接口接收，是要调用HashMap$Node的get方法
            System.out.println(node.getKey()+":::"+node.getValue());
        }
        System.out.println("================");
        //只是取值，不关心key
        Collection values = map.values();
        System.out.println(values);
            //迭代器遍历
            //增强for遍历
    }
}
