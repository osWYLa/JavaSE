package Scanner;

import java.util.Scanner;

/**
 * @author wyl
 * @create 2020-08-08
 * @Description
 * @Version
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name =scanner.next();
        System.out.println("请输入年龄");
        int age= scanner.nextInt();
        System.out.println("请输入薪水");
        double salary = scanner.nextDouble();

        System.out.println("信息打印：name= "+name+" 年龄="+age+" 薪水="+salary);
    }
}
