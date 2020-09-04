package ObjectTest;

/**
 * @author wyl
 * @create 2020-08-18
 * @Description
 * @Version
 */
public class FinalizeTest {
    public static void main(String[] args) {
        Car car = new Car("111");
        car = null;
        System.gc();
    }
}

class Car {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("回收。。。");
    }
}
