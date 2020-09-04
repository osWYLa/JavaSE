package Interface;

/**
 * @author wyl
 * @create 2020-08-06
 * @Description   一个接口可以继承多个接口，实现这个接口时它继承的接口内容也要实现
 * @Version
 */
public interface FunctionPart extends USB,WiFi {
    void USBandWiFi();
}
