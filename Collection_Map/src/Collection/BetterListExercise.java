package Collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author wyl
 * @create 2020-09-06
 * @Description
 * @Version
 */
@SuppressWarnings("ALL")
public class BetterListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book02("三国", 15, "罗贯中"));
        list.add(new Book02("红楼", 28, "曹雪芹"));
        list.add(new Book02("西游", 20, "吴承恩"));
        //遍历
        System.out.println("初始遍历");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("排序之后遍历");
        sort(list);
        iterator = list.iterator(); //不需要重新创建，重置前一个即可
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    public static void sort(List list) {
        //冒泡排序
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - j; j++) {
                //按照之前应该是比较大小交换
                //取出j和j+1对应的book
                //本来还应该判断类型的
                Book02 book01 = (Book02) list.get(j);
                Book02 book02 = (Book02) list.get(j + 1);
                if (book01.getPrice() > book02.getPrice()) {
                    //交换 本来应该建立一个临时变量交换的，但这里使用set方法做替换
                    list.set(j, book02);
                    list.set(j + 1, book01);
                }
            }
        }
    }

}

class Book02 {
    private String name;
    private float price;
    private String writer;

    public Book02(String name, float price, String writer) {
        this.name = name;
        this.price = price;
        this.writer = writer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public String toString() {
        return
                "书名：" + name + '\t' +
                        "价格：" + price + '\t' +
                        "作者：" + writer + '\t';
    }
}
