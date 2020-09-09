/**
 * @author wyl
 * @create 2020-09-09
 * @Description
 * @Version
 */
public class CustomGeneric {
    public static void main(String[] args) {
        T1<String> stringT1 = new T1<>();
        T1<Integer> integerT1 = new T1<>();
    }
}

class T1<E>{ //E表示一个泛型
    E varE; //varE是类型为E的一个属性，E类型是在创建T1对象时指定的；
}
