/**
 * @author wyl
 * @create 2020-08-05
 * @Description
 * @Version
 */
public class testFor02 {
    public static void main(String[] args) {
        for (int i = 100; i < 201; i++) {
            boolean flag = true;
            for (int j = 2; j < i - 1; j++) {
                if ((i % j) == 0) {
                    flag = false;
                    System.out.println(i + "非素数");
                }
            }
            if (flag) System.out.println(i + "素数");
        }
    }
}
