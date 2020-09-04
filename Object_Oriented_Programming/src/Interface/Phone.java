package Interface;

/**
 * @author wyl
 * @create 2020-08-06
 * @Description
 * @Version
 */
public class Phone implements USB,WiFi {
    @Override
    public void read() {
        System.out.println("Phone read");
    }

    @Override
    public void write() {
        System.out.println("Phone write");
    }

    @Override
    public void open() {
        System.out.println("Phone open");
    }

    @Override
    public void close() {
        System.out.println("Phone close");
    }
}
