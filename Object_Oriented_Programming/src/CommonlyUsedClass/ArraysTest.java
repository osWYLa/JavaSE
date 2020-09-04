package CommonlyUsedClass;

import InnerClass.AnonymousInnerClass.A;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author wyl
 * @create 2020-09-01
 * @Description Arrays 用于管理或者操作数组（如排序和搜索）
 * 排序：自然排序和定制排序（重要讲解）
 * @Version
 */
public class ArraysTest {
    public static void main(String[] args) {
        Integer arr[] = {1, -1, 7, 0, 89};//自动装箱

        // 自然排序，从小到大
        Arrays.sort(arr); //Integer引用使用Object接收，向上转型
            //增强For循环
        for (Integer i :
                arr) {
            System.out.println(i);
        }
            //简单For循环
        System.out.println("排序前：");
        for (int i =0;i<arr.length ;i++){
            System.out.println(+arr[i]);
        }

        //要求从大到小部类，接口编程）
        //接口编程概念-->这里传入一个比较器

        //此处的arr排序过程中，会使用到传入的匿名内部类 对象
        Arrays.sort(arr, new Comparator() {
            @Override  //通过接口暴露算法中特定内容
            public int compare(Object o1, Object o2) { //在这里指定比较规则(OOP思想，实际上Compartor具体实现的compare方法是要根据运行类型动态绑定到我们实现的compare方法的)
                //向下转型 Object - > Integer
                Integer n1 = (Integer) o1;
                Integer n2 = (Integer) o2;
                if (n1>n2){
                    return -1;
                }else if(n1 <n2){
                    return 1;
                }
                else return 0;
            }
        });//对于此处没有实现Comparator接口中的equal方法的问题。实际上是理解不准确。
            //接口和Object类没有什么关系，实现接口的类是Object类的子类，上述的equal方法就是使用了超类中Object默认实现的equals，
            //因此，并非没有实现，只是匿名类作为Object的子类，默认使用的是Object中实现的equals方法。
        System.out.println("排序后：");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

//模拟Arrays,写一个sort，通过比较器指定排序顺序
class MyArrays{
    //数组使用Integer
    public static void sort(Integer[] arrs,Comparator c){
        //使用冒泡排序
        Integer temp;
        for (int i =0;i<arrs.length -1;i++){
            for (int j=0;j<arrs.length-i-1;j++){
               /* //硬编码
                if (arrs[j]>arrs[j+1]){
                    temp = arrs[j];
                    arrs[j]=arrs[j+1];
                    arrs[j+1]=temp;
                }*/
                //使用接口替代，使更加灵活
                if (c.compare(arrs[j],arrs[j+1])>0){
                    temp = arrs[j];
                    arrs[j]=arrs[j+1];
                    arrs[j+1]=temp;
                }
            }
        }
    }



    public static void main(String[] args) {
        Integer arr[] = {1, -1, 7, 0, 89};//自动装箱

        System.out.println("排序前：===========");
        for (Integer i :
                arr) {
            System.out.print(i+" ,");
        }
        System.out.println("");

        MyArrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer n1 = (Integer) o1;
                Integer n2 = (Integer) o2;
                if (n1>n2){
                    return -1;
                }else if(n1<n2){
                    return 1;
                }else return 0;
            }
        });
        System.out.println("排序后：===========");
        for (Integer i :
                arr) {
            System.out.print(i+" ,");
        }
    }


}
