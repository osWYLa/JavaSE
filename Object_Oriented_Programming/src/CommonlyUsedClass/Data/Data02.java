package CommonlyUsedClass.Data;

import java.util.Calendar;

/**
 * @author wyl
 * @create 2020-09-03
 * @Description  第二代日期类 主要是Calendar类(日历)
 * @Version
 */
public class Data02 {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();  //抽象类，但在getInstance方法中返回了实现的实例，可以查看运行时类型查看具体实现的类
        System.out.println(instance+" "+instance.getClass());
        //instance已经包含了数据信息

        //格式化，第二代没有专门的格式化方法，需要自己组合
            //如按照：yyyy-MM-dd hh-mm-ss (月从0开始，需要加1)
        System.out.println(instance.get(Calendar.YEAR)+"-"+(instance.get(Calendar.MONTH)+1)+"-"+instance.get(Calendar.DAY_OF_MONTH));

    }
}
