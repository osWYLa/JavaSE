package StaticApplication;

/**
 * @author wyl
 * @create 2020-08-18
 * @Description  有一个经典的单例模式，Java.lang.Runtime
 * @Version
 */
public class Singleton01 {
    public static void main(String[] args) {
        GirlFriend girlFriend01 = GirlFriend.getGirlFriend();
        Wife wife01 = Wife.getWife("001");

       // java.lang.Runtime ;//经典的饿汉式
    }
}

//饿汉式（没有使用之前就直接创建好,类加载就创建对象实例；不存在线程安全问题；存在浪费资源的可能）
class GirlFriend {
    private String name;

    //构造器私有化
    private GirlFriend(String name) {
        this.name = name;
    }

    //创建一个对象
    private static GirlFriend girlFriend = new GirlFriend("yuye");

    //暴露一个方法，用来返回对象的引用
    public static GirlFriend getGirlFriend() {
        return girlFriend;
    }
}

//懒汉式（使用时才创建对象实例；存在线程安全问题）
class Wife {
    private String name;

    private static Wife wife;  //默认为Null

    //构造器私有化
    private Wife(String name) {
        this.name = name;
    }

    //提供共有方法
    public static Wife getWife(String name){
        if(wife == null){
            wife = new Wife(name);
        }
        return wife;
    }
}