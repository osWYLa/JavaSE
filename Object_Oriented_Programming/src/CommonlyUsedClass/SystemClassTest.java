package CommonlyUsedClass;

import java.util.Arrays;

/**
 * @author wyl
 * @create 2020-09-03
 * @Description
 * @Version
 */
public class SystemClassTest {
    public static void main(String[] args) {
        //System.exit 退出
        System.out.println("hello");
             //  System.exit(0);
        System.out.println("world");
        //arrayCopy 复制数组元素，偏底层。一般使用Arrays.copyOf复制数组
        int[] src = {1,2,3};
        int[] dst = new int[3];
            //src 源数组；
            //srcPos: 0 从src哪个索引开始拷贝
            //dst 目标数组
            //destPos 表示把元素拷贝到dest第几个索引后
            //length 拷贝几个元素
        System.arraycopy(src,0,dst,0,3);
        System.out.println(Arrays.toString(dst));

        System.currentTimeMillis();
        System.gc();
    }
}
