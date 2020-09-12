package IO.JavaIO.IOStream.字节流;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author wyl
 * @create 2020-09-12
 * @Description
 * @Version
 */
public class Exercise {
    public static void main(String[] args) {
        String srcfilePath = "E:\\IDEA_Project\\new\\JavaSETest\\Object_Oriented_Programming\\src\\IO\\JavaIO\\IOStream\\temp\\";
        String fileName ="hello.txt";
        FileOutputStream fileOutputStream = null;
        File file = new File(srcfilePath);
        if (!file.exists()){
            if (file.mkdirs()){
                System.out.println("文件夹创建成功");
            }else System.out.println("文件夹创建失败");
        }else System.out.println("文件夹已经存在");

        File file1 = new File(file, fileName);
        if (!file1.exists())
        {
            try {
                if (file1.createNewFile()) System.out.println("文件创建成功！");
                else System.out.println("文件创建失败！");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else System.out.println("文件已经存在");

        //这地方文件一定存在了么？是否需要在文件创建失败做其他处理
        if (file1.exists()){
            try {
                fileOutputStream = new FileOutputStream(srcfilePath+fileName,true);
                String src = "hello,world\nhello,java\n";
                fileOutputStream.write(src.getBytes(),0,src.length());
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                try {
                    if (fileOutputStream!=null)
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



        // String dstfilePath = "E:\\IDEA_Project\\new\\JavaSETest\\Object_Oriented_Programming\\src\\IO\\JavaIO\\IOStream\\IO流体系图02.PNG";
    }
}
