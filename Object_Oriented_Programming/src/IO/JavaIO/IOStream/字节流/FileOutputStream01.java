package IO.JavaIO.IOStream.字节流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author wyl
 * @create 2020-09-12
 * @Description
 * @Version
 */
public class FileOutputStream01 {
    public static void main(String[] args) throws IOException {
        //父目录存在的情况下，没有文件会自己创建；父目录不存在，报错
        String filePath = "E:\\IDEA_Project\\new\\JavaSETest\\Object_Oriented_Programming\\src\\IO\\JavaIO\\IOStream\\helloOutput.txt";
        //追加
        FileOutputStream fileOutputStream = new FileOutputStream(filePath,true);
        //写入单个字符，按字节的方式
        fileOutputStream.write('h');
        //写入字符串，需要使用String.getBytes()
        fileOutputStream.write("这是输出流写入的".getBytes());

        fileOutputStream.close();

    }
}
