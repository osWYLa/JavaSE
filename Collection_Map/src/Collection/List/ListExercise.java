package Collection.List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * @author wyl
 * @create 2020-09-06
 * @Description
 * @Version
 */
@SuppressWarnings("ALL")
public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("三国",15,"罗贯中"));
        list.add(new Book("红楼",28,"曹雪芹"));
        list.add(new Book("西游",20,"吴承恩"));

        list.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book = (Book)o1;
                float price1 = book.getPrice();
                Book book1 = (Book)o2;
                float price2 = book1.getPrice();
                if (price1>price2) return 1;
                else if (price1<price2) return -1;
                else return 0;
            }
        });

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            Book book = (Book)iterator.next();
            System.out.print("书名：" + book.getName()+"  ");
            System.out.print("价格："+book.getPrice()+"  ");
            System.out.println("作者："+book.getWriter());
        }

    }
}
class Book{
    private String name;
    private float price;
    private String writer;

    public Book(String name, float price, String writer) {
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
}