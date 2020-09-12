package IO.JavaIO.IOStream.字节流;

import java.io.*;

/**
 * @author wyl
 * @create 2020-09-12
 * @Description
 * @Version
 */
public class CopyImage {
    public static void main(String[] args) {
        String srcfilePath = "E:\\IDEA_Project\\new\\JavaSETest\\Object_Oriented_Programming\\src\\IO\\JavaIO\\IOStream\\IO流体系图.PNG";
        String dstfilePath = "E:\\IDEA_Project\\new\\JavaSETest\\Object_Oriented_Programming\\src\\IO\\JavaIO\\IOStream\\IO流体系图02.PNG";

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream =null;
        try {
             fileInputStream = new FileInputStream(srcfilePath);
             fileOutputStream = new FileOutputStream(dstfilePath);
            //循环拷贝
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = fileInputStream.read(bytes))!=-1){
                //读一部分写一部分
                fileOutputStream.write(bytes,0,len);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream!=null){
                    fileInputStream.close();
                }
                if (fileOutputStream!=null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        System.out.println("copy完成");


    }
}
