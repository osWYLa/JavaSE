package Collection.Vector;

import java.util.Vector;

/**
 * @author wyl
 * @create 2020-09-07
 * @Description
 * @Version
 */
@SuppressWarnings("ALL")
public class VectorTest {
    public static void main(String[] args) {
        //关于Vector的扩容：
        //    1）使用无参构造函数，默认大小为10；需要扩容时，扩容为当前容量的2倍；
        //    2）使用有参构造函数，指定大小，需要扩容时，扩容为当前容量的2倍；
             //1)无参
        Vector vector = new Vector();

        for (int i=0;i<10;i++){
            vector.add("AA"+i);
        }
        for (int i=0;i<5;i++){
            vector.add("BB"+i);
        }
        //遍历
        for (Object o :
                vector) {
            System.out.println(o);
        }

            //2）有参
        Vector vector1 = new Vector(8);
        for (int i=0;i<10;i++){
            vector1.add("AA"+i);
        }
        for (int i=0;i<5;i++){
            vector1.add("BB"+i);
        }
        //遍历
        for (Object o :
                vector1) {
            System.out.println(o);
        }

    }
}
