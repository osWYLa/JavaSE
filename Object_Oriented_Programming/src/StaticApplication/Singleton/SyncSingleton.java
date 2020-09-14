package StaticApplication.Singleton;

/**
 * @author wyl
 * @create 2020-09-14
 * @Description double check 懒汉式双检测
 * @Version
 */
public class SyncSingleton {
    public static void main(String[] args) {

    }
}

class Single{
    //构造器私有化
    private Single(){

    }
    //声明一个Single引用
    private static Single single;

    //暴露一个公共方法
    public static Single getInstance(){  //不考虑直接在方法上加锁，尽量细化

        if (single == null){ //这一步不判断也可以，只是效率太低
            synchronized (Single.class){
                if(single == null) //这里的操作已经有锁的保障，原子操作（还有指令重排序的问题）
                single = new Single();
            }

        }
        return single;
    }
}
