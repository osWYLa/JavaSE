package DebugTest;

/**
 * @author wyl
 * @create 2020-08-18
 * @Description
 *              debug步骤；
 *              下断点；
 *              debug模式启动；
 *
 * @Version
 */
public class Test01 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i=0;i<10;i++){
            sum+=i;
            System.out.println("sum= "+sum);
        }
        System.out.println("for循环退出");
        System.out.println("最终sum= "+sum);

    }
}
