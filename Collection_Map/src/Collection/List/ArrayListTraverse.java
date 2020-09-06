package Collection.List;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wyl
 * @create 2020-09-06
 * @Description List 遍历方式：Collection的两种（迭代器，增强For）；
 *                           由于支持索引 可以使用普通for
 * @Version
 */
public class ArrayListTraverse {
    public static void main(String[] args) {
        TestToString testToString = new TestToString("测试");

        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("hello");
        list.add("yuye");
       // list.add(null);
        list.add("tom");
        list.add(testToString);
        //支持索引
        for (int i=0;i<list.size();i++){
           /* Object object = list.get(i);
            System.out.println(object);*/
            System.out.println(list.get(i).toString());
        }
    }
}
class TestToString{
    String name;

    public TestToString(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

        return "TestToString toString 方法";
    }
}
