package IO.JavaIO.IOStream.字节流.ObjectStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

/**
 * @author wyl
 * @create 2020-09-12
 * @Description
 * @Version
 */
public class ObjectInputStreamTest {
    public static void main(String[] args) throws Exception {
        //IDEA 中快速复制一行到粘贴板 ctrl + 方向下键
        String desfilePath = "E:\\IDEA_Project\\new\\JavaSETest\\Object_Oriented_Programming\\src\\IO\\JavaIO\\IOStream\\temp\\data.dat";

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(desfilePath));
        //恢复的时候需要按顺序(先写进去一个Dog对象，再写一个Int对像)，恢复的时候也一样

        Object o = objectInputStream.readObject();

        int i = objectInputStream.readInt();
        System.out.println(i);

        System.out.println(o.getClass());
        objectInputStream.close();
        System.out.println(o);
        System.out.println("完成");
    }
}
