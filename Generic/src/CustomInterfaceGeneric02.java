/**
 * @author wyl
 * @create 2020-09-09
 * @Description
 * @Version
 */
public class CustomInterfaceGeneric02 {
    public static void main(String[] args) {
        Son<Double> doubleSon = new Son<>();

    }
}

interface IA<E> {
    E hi();
}

interface IB<E> extends IA<String> {
    E ok();
}

class Father<E> {
    E e;

    public E hello(E e) {
        return this.e;
    }
}

class Son<E> extends Father<E> implements IB<E> {

    @Override
    public String hi() {
        return null;
    }

    @Override
    public E ok() {
        return null;
    }
    E ok2(){
        return null;
    }
}