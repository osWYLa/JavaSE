package Enum;

/**
 * @author wyl
 * @create 2020-08-29
 * @Description
 *              自定义实现枚举类型特点：
 *              1、构造器私有化；
 *              2、本类内部创建一组对象；
 *              3、对外暴露对象（通过为对象添加public final static 修饰符）
 *              4、可以提供get方法，但不提供set方法
 * @Version
 */
public class CustomEnum {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
    }
}

class Season { //类，自定义枚举
    private String name; //季节名称
    private String description; //季节描述

    private Season(String name, String description) { //构造器私有化
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    //本质就是单例模式的饿汉式
    public final static Season SPRING = new Season("春天", "温暖");
    public final static Season SUMMER = new Season("夏天", "炎热");
    public final static Season AUTUMN = new Season("秋天", "凉爽");
    public final static Season WINTER = new Season("冬天", "寒冷");

    @Override
    public String toString() {
        return "季节名： "  + name  +
                ", 特点是：" + description  ;
    }
}
