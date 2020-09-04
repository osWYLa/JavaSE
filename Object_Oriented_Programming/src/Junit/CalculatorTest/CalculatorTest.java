package Junit.CalculatorTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author wyl
 * @create 2020-08-11
 * @Description
 * @Version
 */
public class CalculatorTest {

    //测试@Before
    //初始化方法，一般用于申请资源
    @Before
    public void init(){
        System.out.println("init...");
    }

    //测试@CLose
    //关闭，一般用于资源释放
    @After
    public void close(){
        System.out.println("close...");
    }



    //测试add 方法
    @Test
    public void testadd() {
        System.out.println("add Test");
        //创建测试对象
        Calculator calculator = new Calculator();
        //调用测试对象方法
        int res = calculator.add(1, 3);
        //取消输出，使用断言替代
        // System.out.println(res);
        //断言
        Assert.assertEquals(4, res);
    }

    @Test
    public void testsub() {
        System.out.println("sub Test");
        Calculator calculator = new Calculator();
        int res = calculator.sub(3, 1);
        Assert.assertEquals(2, res);
    }
}
