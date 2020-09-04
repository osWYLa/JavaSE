package Wrapper_String.Wrapper;

/**
 * @author wyl
 * @create 2020-09-01
 * @Description
 * @Version
 */
public class InatergerVsInt {
    public static void main(String[] args) {
        //jdk 5之前使用手动装箱和拆箱
            //手动装箱
        int i = 10;
        //1、
        Integer integer = new Integer(i);
        //2、
        Integer integer1 = Integer.valueOf(i);

            //手动拆箱
        int j = integer1.intValue();

        //jdk 5之后使用自动装箱，本质是对上面的封装
            //自动装箱
        int k = 99;
        Integer integer2 = k;
            //自动拆箱
        int  m = integer2;
        /*
        * public static Integer valueOf(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
    }
        * */
        Integer integer3 = new Integer(1);
        Integer integer4 = new Integer(1);
        System.out.println(integer3==integer4); //false new 引用类型对象不同

        Integer integer5 = 1;
        Integer integer6 = 1;
        System.out.println(integer5 == integer6);//True 自动装箱，且在范围内，在IntegerCache.cache获取，同一个对象

        Integer integer7 = 128; //new
        Integer integer8 = 128; //new
        System.out.println(integer7 == integer8);//False 自动装箱，不在范围内，new，不是同一个对象


        // == 如果一边是基本数据类型，一边是包装类，是比较值是否相同


    }
}
