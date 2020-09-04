package Junit.CalculatorTest;

import Junit.CalculatorTest.Calculator;

/**
 * @author wyl
 * @create 2020-08-11
 * @Description  普通做测试
 * @Version
 */
public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int res= calculator.add(1,2);
        System.out.println(res);

        //如果要单独测试减法，就要把加法注释掉（不方便）
    }




}
