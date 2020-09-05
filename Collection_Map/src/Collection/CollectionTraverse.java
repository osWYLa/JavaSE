package Collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author wyl
 * @create 2020-09-05
 * @Description  Collection 遍历元素
 *         方式1：使用Iterator 迭代器
 *            1）Iterator对象称为迭代器（设计模式的一种），主要用于遍历Collection集合中的元素；
 *            2）所有实现了Collection接口的集合类都有一个iterator（）方法，用以返回一个迭代器；
 *            3）Iterator仅用于遍历集合，Iterator本身并不提供和承装对象的能力。如果需要创建Iterator对象，
 *               则必须有一个被迭代的集合；
 *            迭代器执行原理：
 *            Iterator iterator  =  collection.iterator();//得到一个集合的迭代器
 *            //hasNext();判断是否还有下一个元素
 *            while（iterator.hasNext()）{
 *                //next ; ①指针下移；②将下移后集合位置上的元素返回；
 *                System.out.println(iterator.next());
 *            }
 *         方式2：增强for循环遍历（增强for循环就是简化版的iterator，本质一样本质还是迭代器，但是只能遍历集合或者数组）
 *              for(元素类型 元素名：集合或者数组名){
 *                  访问元素
 *              }
 *
 *
 *
 * @Version
 */
@SuppressWarnings("ALL")
public class CollectionTraverse {
    public static void main(String[] args) {
        //Collection 集合的遍历 Iterator迭代器遍历
        Collection collection = new ArrayList();
        collection.add(new Book("三国","罗贯中",18));
        collection.add(new Book("水浒","曹雪芹",20));
        collection.add(new Book("西游记","吴承恩",21));
        collection.add("yuye");
        collection.add(new Dog());
            //通过iterator()返回一个迭代器 Iterator
        Iterator iterator = collection.iterator(); //初始化指针位置
        System.out.println(iterator.getClass());
        while (iterator.hasNext()){

            System.out.println(iterator.next()); //iteratorl.next();返回Object（编译类型），运行类型Book（看开始add对象
                                                 //.toString System.out.println()
        }

        //Collection集合遍历 增强for循环

        for (Object o:collection){
            System.out.println(o.toString());
        }

    }
}

class Book{
    private String name;
    private String writer;
    private float price;

    public Book(String name, String writer, float price) {
        this.name = name;
        this.writer = writer;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book对象的toString{" +
                "name='" + name + '\'' +
                ", writer='" + writer + '\'' +
                ", price=" + price +
                '}';
    }

    public void f1(){
        System.out.println("f1");
    }
}

class Person{

}


