/**
 * @author wyl
 * @create 2020-09-09
 * @Description 自定义泛型方法 并不是在方法中使用泛型。
 *                  泛型方法，可以定义在普通类中，也可以定义在泛型类中；
 *                  当泛型方法被调用时，泛型会确定
 * @Version
 */
public class CustomGenericMethod {
    public static void main(String[] args) {
        MyGeneric<String, Double, Integer> stringDoubleIntegerMyGeneric = new MyGeneric<>();
        stringDoubleIntegerMyGeneric.fly(1.1f); //泛型方法的类型在泛型方法被调用时确定，这里调用时fly方法时，通过传递的参数，确定泛型为Float


    }
}

class MyGeneric<T,R,M>{  //自定义泛型类(自定义泛型类中使用泛型方法)
    public <E> void fly(E t){ //自定义泛型方法，和这个类传入的泛型无关（这里把传入的M换成E也不冲突）
        System.out.println(t);
        System.out.println(t.getClass());
    }
}

class MyClass{//普通类中使用泛型方法
    public <A> A show(A a){
        System.out.println("a的值；"+a);
        System.out.println("a的类型："+a.getClass().getSimpleName());
        return a;
    }
}