package CommonlyUsedClass;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author wyl
 * @create 2020-09-02
 * @Description 自定义Book类，里面包括了name和price，按照price的大小排序。要求使用Arrays（自己写排序也可以完成）两种方式排序，
 * 对对象的某个属性进行排序
 * <p>
 * //方式一：使用匿名内部类实现Comparator接口
 * //方式二：直接使用类实现Comparable接口
 * @Version
 */
public class ArraysExercise {
    public static void main(String[] args) {
        //对象数组
        Book[] book = {new Book("西游记", 10), new Book("水浒传", 20),
                new Book("红楼梦", 60), new Book("三国", 15),};
        System.out.println("=================");
        System.out.println("方式1排序之前：");
        for (Book b :
                book) {
            System.out.println(b.toString());
        }

        //方式1：使用匿名内部类实现
        Arrays.sort(book, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                //这里编译器自动把参数设置好了，否咋应该还是需要向下转型，同时向下转型的时候最好先判断类型
                if (o1.getPrice() > o2.getPrice()) return -1;
                else if (o1.getPrice() < o2.getPrice()) return 1;
                else return 0;
            }
        });
        System.out.println("=================");
        System.out.println("方式1排序之后：");
        for (Book b :
                book) {
            System.out.println(b.toString());
        }


        //方式2：
        //
        //对象数组
        Book02[] book2 = {new Book02("西游记", 10), new Book02("水浒传", 20),
                new Book02("红楼梦", 60), new Book02("三国", 15),};

        //方式2排序之前：
        System.out.println("=================");
        System.out.println("方式二排序之前");
        for (Book02 b :
                book2) {
            System.out.println(b.toString());
        }

        //直接传递book2数组报错(java.lang.ClassCastException: CommonlyUsedClass.Book cannot be cast to java.lang.Comparable)
        //Arrays.sort(book2);
        //直接传递Integer可以(因为Integer实现了Comparable接口)，后面会将Object 中的一个元素转成Comparable接口类型，如果没有实现这个接口，会出现上面的转换异常
        Integer[] integer = {1, 2, 3, 4, 5, 6};
        Arrays.sort(integer);


        Arrays.sort(book2);  //调用compare方法时由于为Book02对象，直接运行时类型调用自己实现的compare方法
        System.out.println(Arrays.toString(book2));
        //方式2排序之后
        System.out.println("================");
        System.out.println("方式二排序之后");
        for (Book02 b1:
             book2) {
            System.out.println(b1.toString());

        }



    }
}

class Book {
    private String name;
    private float price;

    public Book(String name, float price) {
        this.name = name;
        this.price = price;
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

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

//使用类直接实现Comparable接口
class Book02 implements Comparable {
    private String name;
    private int price;

    public Book02(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book02{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        //判断类型
        if (this == o) return 0;
        if (!(o instanceof Book02)) return 0;

        //向下转型
        int price1 = ((Book02) o).price;
        if (price1 > price) return 1;
        else if(price1<price) return -1;
        else return 0;
    }
}


