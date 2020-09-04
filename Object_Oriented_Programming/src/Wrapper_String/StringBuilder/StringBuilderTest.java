package Wrapper_String.StringBuilder;

/**
 * @author wyl
 * @create 2020-09-01
 * @Description
 * @Version
 */
public class StringBuilderTest {
    public static void main(String[] args) {
//实测，单线程情况下，stringBuilder 比StringBuffer快一半左右
        test(new sub1());
        test(new sub2());
    }

    public static void test(Template templateP) {
        templateP.calculateTime();
    }
}

abstract class Template {
    abstract void code();

    public long calculateTime() {
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        return end - start;
    }
}

class sub1 extends Template {
    @Override
    void code() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 80000; i++) {
            stringBuilder.append("hello");
        }
    }
}

class sub2 extends Template{
    @Override
    void code() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i =0;i<80000;i++){
            stringBuffer.append("hello");
        }
    }
}