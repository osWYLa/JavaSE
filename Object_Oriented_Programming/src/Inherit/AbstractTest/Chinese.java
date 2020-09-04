package Inherit.AbstractTest;

/**
 * @author wyl
 * @create 2020-08-05
 * @Description
 * @Version
 */
public class Chinese extends Person_Abstract {
    public Chinese(String name, int age) {
        super(name, age);
    }

    //复写父类方法，将抽象方法具体化
    @Override
    void eat() {
        System.out.println("使用筷子吃饭");
    }
    public void sayhello(){
        System.out.println("hello");
    }
}
