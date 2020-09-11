package IO.JavaIO.File;

import java.io.File;
import java.io.IOException;

/**
 * @author wyl
 * @create 2020-09-11
 * @Description 几个构造器
 * @Version
 */
public class CreateFile {
    public static void main(String[] args) throws IOException {
        String address = "E:\\IDEA_Project\\new\\JavaSETest\\Object_Oriented_Programming\\src\\IO\\JavaIO\\File\\";
        String fileName = "a.txt";
        //方式1：
            //位置：E:\IDEA_Project\new\JavaSETest\Object_Oriented_Programming\src\IO\JavaIO
        //在Java中创建了一个file对象，注意不是创建文件（硬盘）
        File file = new File(address+fileName);
        //创建文件
        if (file.createNewFile()) {
            System.out.println(file.getName()+" 创建成功");
        }else System.out.println(file.getName()+" 创建失败");

        //方式2：
        File file2 = new File(address, "2"+fileName);
        if (file2.createNewFile()) {
            System.out.println(file2.getName()+" 创建成功");
        }else System.out.println(file2.getName()+" 创建失败");

        //方式3：
        File parent = new File(address);
        File file3 = new File(parent, "3" + fileName);
        if (file3.createNewFile()) {
            System.out.println(file3.getName()+" 创建成功");
        }else System.out.println(file3.getName()+" 创建失败");


    }
}
