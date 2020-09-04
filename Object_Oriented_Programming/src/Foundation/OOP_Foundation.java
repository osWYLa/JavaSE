package Foundation;

import java.util.Arrays;

/**
 * @author wyl
 * @create 2020-08-05
 * @Description
 * @Version
 */
public class OOP_Foundation {
    public static void main(String[] args) {
        //要求打印出【10,20,30,40,50,60,70,80】
        int arry[] = {10, 20, 30, 40, 50, 60, 70, 80};
        //Process_Oriented_Programming
        System.out.print("[");
        for (int i = 0; i < arry.length; i++) {
            if (i == (arry.length - 1)) {
                System.out.println(arry[i] + "]");
            } else {
                System.out.print(arry[i] + ",");
            }
        }
        System.out.println("========================");

        //OOP
        System.out.println(Arrays.toString(arry));
        System.out.println(Arrays.toString(arry).replace(" ",""));
    }
}
