/**
 * @author wyl
 * @create 2020-09-09
 * @Description
 * @Version
 */
public class CustomInterfaceGeneric {
    public static void main(String[] args) {
        //泛型的使用最重要的是确定，泛型的具体数据类型是什么时候确定
            //对于普通类，在对象创建是指定
            //对于接口：
                    //当一个接口继承一个泛型接口时，需要指定父接口泛型的具体类型；同时这个接口还可以有自己的泛型
                    //当一个类实现接口时


    }
}


//当一个接口继承一个泛型接口时，需要指定父接口泛型的具体类型；同时这个接口还可以有自己的泛型
interface SubMyInterface<E> extends MyInterface<String,Integer>{
   public E hi();

}
//演示一个类实现SubMyInterface
class Tiger implements SubMyInterface<String>{ //如果没有指定String，默认为Object

    @Override
    public String hi() { //原先SubMyInterface的hi()返回值类型E(泛型)被指定成String
        return null;
    }

    @Override
    public Integer get(String s) {
        return null;
    }

    @Override
    public void app(Integer integer) {

    }

    @Override
    public void consume(Integer r1, Integer r2, String u1, String u2) {

    }
}

interface MyInterface<U,R>{
    R get(U u);

    void app(R r);

    void consume(R r1,R r2,U u1,U u2);

    //JDK 1.8 可以在接口中使用默认方法
    default  R method(U u){
        return null;
    }

}
