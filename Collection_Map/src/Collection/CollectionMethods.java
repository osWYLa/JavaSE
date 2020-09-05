package Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author wyl
 * @create 2020-09-05
 * @Description
 *              Collection 接口：
 *              1）Collection 可以存放多个元素，每个元素可以是Object
 *              2）Collection的实现类可以存放多个元素，有些实现类可以重复，有些不可以；
 *              3）Collection的实现类，List是有序的，Set是无序的；
 *              4）Collection接口没有直接的实现子类，通过子接口List和Set来实现Collection；
 * @Version
 */
@SuppressWarnings("ALL")
public class CollectionMethods {
    public static void main(String[] args) {
        //以ArrayList为例（多态，向上转型），调用讲解collection中的方法（被ArrayList实现）
        Collection collection = new ArrayList();
            //添加单个元素（传入对象）
        collection.add("hello");
        collection.add(1000); //collection.add(Integer.valueOf(1000))，自动装箱成包装类
        collection.add(1.2);
        collection.add(new Dog());
        System.out.println("集合内容："+collection);
        System.out.println("集合内容："+collection.toString());  //Debug 调试时可以选择进入println还是 toString(AbstractCollection)
            //删除指定元素
        collection.remove(1000);
        System.out.println("删除后集合："+collection);
            //查找元素是否存在
        System.out.println(collection.contains("hello"));
            //获取集合元素个数
        System.out.println("集合的元素个数："+collection.size());
            //集合是否为空
        System.out.println("集合是否为空："+collection.isEmpty());
            //集合清空
        collection.clear();
        System.out.println("集合清空后："+collection); //查看AbstractCollecion中的toString实现

        collection.add("hello");
        collection.add(1000); //collection.add(Integer.valueOf(1000))，自动装箱成包装类
        collection.add(1.2);
        collection.add("yuye");
        collection.add("helloyuye");

            //添加多个元素
        collection.addAll(collection);
        System.out.println("集合添加多个（复制自身后）："+collection); //ArrayList可以有重复数据
            //判断多个元素是否存在
        Collection collection1 = new ArrayList();
        collection1.add("yuye");
        collection1.add("helloyuye");
        System.out.println(collection.containsAll(collection1));
            //删除多个元素
        collection.removeAll(collection1);
        System.out.println("删除多个元素之后："+collection);
    }
}

class Dog{

}
