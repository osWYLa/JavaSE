package CommonlyUsedClass;

import java.util.Arrays;
import java.util.List;

/**
 * @author wyl
 * @create 2020-09-02
 * @Description
 *             Arrays中的sort方法，还有一些方法值得注意一下:
 *             binarySearch：通过二分查找法进行查找（要求必须是已经排好序的）
 *             copyOf 数组元素的复制；
 *             fill 数组元素的填充
 *             比较
 *             toString
 *             asList 将一组值转换成list
 *
 * @Version
 */
public class ArraysMethod {
    public static void main(String[] args) {
        Integer[] integer = {1,2,3,4,5,80};
        //二分查找
        int i = Arrays.binarySearch(integer, 20); //如果找到，返回下标；如果没有找到，返回  -（应该在顺序中的位置+1）
        System.out.println(i);
        //数组元素复制
            //如果有效长度在1~ arr.length 之间，拷贝指定长度；
            //如果拷贝长度 大于 arr.length ，多余会使用null填充；小于0，报错
        Integer[] integer1 = Arrays.copyOf(integer,integer.length);
        System.out.println("拷贝后：");
        for (Integer j :
                integer1) {
            System.out.println(j);
        }
        //填充
        Arrays.fill(integer,100);
        System.out.println("填充后：");
        for (Integer j :
                integer) {
            System.out.println(j);
        }
        //比较
        Integer[] integer2 = {1,2,3,4,5,80};
        Integer[] integer3 = {1,2,3,4,5,80};
        System.out.println(Arrays.equals(integer2,integer3));
        //toString 方法
        System.out.println(Arrays.toString(integer3));
        //asList
        List<Integer> asList = Arrays.asList(2,3,4,5,6);//可变参数 泛型 <T ... a>
        System.out.println("asList "+asList);
    }
}
