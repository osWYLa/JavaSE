package Collection.List;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wyl
 * @create 2020-09-05
 * @Description Collection 接口的子接口：List
 *                  List接口；
 *                  1)List集合类中元素有序（添加顺序和取出顺序一致）且可重复；
 *                  2）List集合中每个元素都有其对应的顺序索引，即支持索引；
 *                  3）List容器中的元素都对应一个整数型的序号记载其在容器中的位置，可以根据序号存取容器中的元素；
 *                  4)JDK API中List接口的常用实现类有：ArrayList、LinkedList、Vector、Stack
 * @Version
 */
@SuppressWarnings("ALL")
public class SubInterface_List {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("hello");
        list.add("yuye");
        list.add(null);
        list.add("tom");
        System.out.println(list); //有序可重复

        //支持索引
        list.add(1,"world");
        System.out.println(list);

        System.out.println(list.get(2));



    }
    @Test
    public void testMethods(){
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("hello");

        //常用方法：
        //void add(int index,Object ele) 在index索引位置插入ele元素（对象）
        list.add(0,"天坛"); //index需要在合理范围内，否则报异常
        System.out.println(list);
        //boolean addAll(int index,Collection eles) 从index位置插入eles中所有元素
        list.addAll(list);
        System.out.println(list);
        //Object get(int index) 获取指定index位置的元素
        System.out.println(list.get(0));
        // int indexOf(Object obj) 返回obj在集合中首次出现的位置，没有返回-1
        System.out.println(list.indexOf("tom"));
        //int lastIndexOf(Object obj) 返回obj在当前集合中末次出现的位置
        System.out.println(list.lastIndexOf("tom"));
        //Object remove(int index) 移除指定index位置的元素，并返回此元素
        list.remove(2); //除了可以按照 内容删除还可以按索引删除
        System.out.println(list);
        //Object set(int index,Object ele) 设置指定index位置的元素为ele，相当于替换
        list.set(0,"nihao");
        System.out.println(list);
        //List subList(int fromIndex,int toIndex) 返回fromIndex到toIndex位置的子集合
        System.out.println(list.subList(0,2)); //左闭右开



    }

}
