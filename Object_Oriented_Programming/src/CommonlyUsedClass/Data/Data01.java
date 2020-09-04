package CommonlyUsedClass.Data;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wyl
 * @create 2020-09-03
 * @Description 第一代日期使用
 * @Version
 */
public class Data01 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);

        //使用SimpleDateFormat进行格式化输出
            //字母安装规格写
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        String format = simpleDateFormat.format(date);
        System.out.println(format);

        //通过一个毫秒数得到对应的日期
        Date date1 = new Date(9789879878L);
        System.out.println(simpleDateFormat.format(date1));

        //将字符串反转成日期
        /*String s  = "yyyy年MM月dd日 HH:mm:ss E";
        Date parse = simpleDateFormat.parse(s);*/
        String time2="1996-09-18 07:18:09";
        SimpleDateFormat format2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date2=format2.parse(time2);//将字符串转换成时间(parse 需要异常处理)
        System.out.println(date2);


    }
}
