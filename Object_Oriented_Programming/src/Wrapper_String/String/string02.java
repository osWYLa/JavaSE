package Wrapper_String.String;

/**
 * @author wyl
 * @create 2020-09-01
 * @Description string 效率问题
 * @Version
 */
public class string02 {
    public static void main(String[] args) {
        test(new sub1());
        test(new sub2());
    }

    public static void test(time t){
        t.calculat();
    }

}



abstract class time{
    abstract void code();
    public long  calculat(){
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        return end-start;
    }

}
class sub1 extends time{

    @Override

        void code() {
            String s  ="";
            for (int i =0;i<30000;i++){
                s+="hello";
            }
        System.out.println("sub1长度："+s.length());
        }

}
class sub2 extends time{
    @Override
    void code() {
        StringBuffer stringBuffer = new StringBuffer("");
        for (int i= 0;i<30000;i++){
            stringBuffer.append("hello");
        }
        System.out.println("sub2长度："+stringBuffer.length());
    }
}
