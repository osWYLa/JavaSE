/**
 * @author wyl
 * @create 2020-08-05
 * @Description
 * @Version
 */
public class testFor {
    public static void main(String args[]) {
        for (int i = 100; i < 201; i++) {
            for (int j = 2; j < i - 1; j++) {
                if ((i % j) == 0) {
                    System.out.println(i + "不是素数");
                    break;
                }
                if(j==(i-2))
                    System.out.println(i+"是素数");
            }
        }
    }
}
