package Interface;

/**
 * @author wyl
 * @create 2020-08-06
 * @Description
 * @Version
 */
public class USBPhone implements USB{
    @Override
    public void read() {
        System.out.println("USBPhone read");
    }

    @Override
    public void write() {
        System.out.println("USBPhone write");
    }

    @Override
    public void speed() {
        System.out.println("USBPhone speed");
    }
}
