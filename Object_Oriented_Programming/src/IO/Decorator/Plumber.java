package IO.Decorator;

/**
 * @author wyl
 * @create 2020-08-07
 * @Description
 * @Version
 */
public class Plumber implements Worker{
    @Override
    public void doSomework() {
        System.out.println("水管工");
    }
}
