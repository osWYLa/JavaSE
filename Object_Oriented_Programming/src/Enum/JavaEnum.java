package Enum;

/**
 * @author wyl
 * @create 2020-08-29
 * @Description
 * @Version
 */
public class JavaEnum {
    public static void main(String[] args) {
        System.out.println(Season2.AUTUMN);
    }
}
enum Season2 {//类，枚举类（使用enum枚举类之后就不能再继承其他类，单继承，已经默认继承Enum）

    /*    //本质就是单例模式的饿汉式
    public final static Season SPRING = new Season("春天", "温暖");
    public final static Season SUMMER = new Season("夏天", "炎热");
    public final static Season AUTUMN = new Season("秋天", "凉爽");
    public final static Season WINTER = new Season("冬天", "寒冷");*/
//enum 简化；使用enum，常量必须写在最前面（枚举对象必须放在枚举类的行首）；使用enum之后，Season类会默认继承Enum这个类
    //使用反编译： javap -p .\Season2.class 可以看到 或者 CTRL + ALT +U 查看继承关系图
    Spring("春天", "温暖"),
    SUMMER("夏天", "炎热"),
    AUTUMN("秋天", "凉爽"),
    WINTER("冬天", "寒冷"),
    TEST; //使用无参构造器（此时由于时String 类型的，默认值为NULL），后面的实参列表和小括号都可以省略

    private String name; //季节名称
    private String description; //季节描述

    private Season2(String name, String description) { //构造器私有化
        this.name = name;
        this.description = description;
    }

    //无参构造器
    Season2() {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


/*    //本质就是单例模式的饿汉式
    public final static Season SPRING = new Season("春天", "温暖");
    public final static Season SUMMER = new Season("夏天", "炎热");
    public final static Season AUTUMN = new Season("秋天", "凉爽");
    public final static Season WINTER = new Season("冬天", "寒冷");*/

    @Override
    public String toString() {
        return "季节名： "  + name  +
                ", 特点是：" + description  ;
    }
}
