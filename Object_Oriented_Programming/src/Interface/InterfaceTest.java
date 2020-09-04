package Interface;



/**
 * @author wyl
 * @create 2020-08-06
 * @Description
 *              //接口的命名一般以IInterface I开头
 *              //一个类只可以继承一个类，但可以实现多个接口；接口支持多继承
 *              //Java中允许将一个实现了某个类接口的类的对象，传递给该接口的引用
 *              // 接口使用过程中，仍然遵守多态和动态绑定机制
 *              //一个子类同时实现两个接口的时候：
 *              如果两个接口中有同样的抽象方法，那么子类在实现的时候，其实无所谓，反正都是实现。
 *              但如果两个接口中有同样的属性，必须通过 接口名.属性名 （接口中的属性是接口相关的，系统会将其自动设置为 public static final）
 *              加以明确
 *
 *             //关于抽象类实现接口：
 *             抽象类可以实现接口，意义如下：普通类在实现接口的时候，必须实现接口中的所有方法，这样可能会导致普通类中实现一些冗余的方法。但是
 *             如果是抽象类去实现这个接口，再搞个类去继承抽象类，这样，抽象类在实现接口时可以只实现部分方法，并且当其他类继承这个类的时候，仍然可以
 *             选择去具体实现那种方法，如果需要的方法该抽象类并没有实现也没有关系，（有点像继承），这个实例类可以通过这个抽象类实现接口中的任意抽象方法。
 *
 * @Version
 */
public class InterfaceTest {
    public static void main(String[] args) {
       /* USBPhone usbPhone = new USBPhone();
        usbPhone.read();
        usbPhone.write();
        usbPhone.speed();*/
        //使用向上转型
        USB usb = new USBPhone();
        usb.read();
        usb.write();
        usb.speed();

        USB usb1=new Phone();
        usb1.read();
        usb1.write();
        usb1.speed();

        WiFi wiFi =new Phone();
        wiFi.open();
        wiFi.close();

    }
}
