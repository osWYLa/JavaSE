import java.util.Arrays;

/**
 * @author wyl
 * @create 2020-08-05
 * @Description 布尔值类型的默认值为false；int 数组的默认值是0
 * @Version
 */
public class testArray {
    public static void main(String[] args) {
        boolean flag;
        int arr[] ={2,3,4,5};
        int arr1[] =new int[10];
        Arrays.stream(arr).forEach(System.out::println);
        for (int j=0;j<arr1.length;j++)
            System.out.println(arr1[j]);
        //foreach
        for (int x:arr)
            System.out.println(x);

        //2dim
        int arr2dim[][] = {{2,3,4},{3,4,5},{4,5,6}};
        for (int i =0;i<arr2dim.length;i++)
        {
            for (int j =0;j<arr2dim[i].length;j++)
                System.out.println(arr2dim[i][j]);

        }
        //foreach 2dim
        for (int x[]:arr2dim)
        {
            for(int j:x)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
