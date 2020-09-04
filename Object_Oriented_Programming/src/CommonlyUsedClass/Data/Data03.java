package CommonlyUsedClass.Data;


import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author wyl
 * @create 2020-09-03
 * @Description 第三代日期类(推荐使用)
 *              前两代日期类的不足：
 *              Date类，很多被弃用；
 *              Calendar 类 ，日期这样的类应该是不可变的；Date中的年份是从1900年开始，而月份从0开始；
 *                  格式化只针对Date有用，Calendar不行；
 *                  线程不安全；不能处理闰秒等（每隔两天多出1s）
 *
 *              第三代日期类中主要方法：
 *              1）LocalDate(日期字段)、LocalTime(时间字段)、LocalDateTime(日期时间字段)
 *
 * @Version
 */
public class Data03 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now(); //日期时间对象
        System.out.println(now);
        //从日期时间对象获取相应字段:
        System.out.println(now.getYear());
        System.out.println(now.getMonthValue());
        System.out.println(now.getMonth());
        System.out.println(now.getHour());
        System.out.println(now.getMinute());

        //格式化 DateTimeFormatter

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = dateTimeFormatter.format(now);
        System.out.println(format);

        //Instance 和 Date 转换
        System.out.println("==================Instance 和 Date 相互转换");
        Instant now1 = Instant.now();
        System.out.println(now1);
        Date from = Date.from(now1);
        Instant instant = from.toInstant();



    }
}
