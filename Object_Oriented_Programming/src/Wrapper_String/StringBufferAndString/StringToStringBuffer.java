package Wrapper_String.StringBufferAndString;

/**
 * @author wyl
 * @create 2020-09-01
 * @Description
 * @Version
 */
public class StringToStringBuffer {

    public static void main(String[] args) {
        String string = "hello";
        //String --> StringBuffer
        //方式一：
        StringBuffer stringBuffer = new StringBuffer(string);
        //方式二：
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1.append(string);

        //StringBuffer-->String
        //方式1：
        String string1 = stringBuffer.toString();
        //方式二：
        String s = new String(stringBuffer);
    }
}
