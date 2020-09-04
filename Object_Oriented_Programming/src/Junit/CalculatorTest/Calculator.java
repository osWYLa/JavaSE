package Junit.CalculatorTest;

/**
 * @author wyl
 * @create 2020-08-11
 * @Description
 * @Version
 */
public class Calculator {
    public int add(int a, int b) {
        //异常测试
     //   int i = 1/0;
        //测试判定结果
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

}
