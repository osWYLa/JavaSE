package IO.JavaIO.IOStream.字节流.BufferedInputStream_BufferedOutputStream;

import java.io.*;

/**
 * @author wyl
 * @create 2020-09-12
 * @Description
 * @Version
 */
public class BufferdeIn_OutStream {

    //BufferedIn/OutputStream 设置buffer缓冲区
    //使用装饰这模式统一管理各种流，提高效率（这里BufferedIn/OutputStream 管理In/OutputStream流）
    public static void main(String[] args) {
        String srcfilePath = "E:\\IDEA_Project\\new\\JavaSETest\\Object_Oriented_Programming\\src\\IO\\JavaIO\\IOStream\\IO流体系图.PNG";
        String dstfilePath = "E:\\IDEA_Project\\new\\JavaSETest\\Object_Oriented_Programming\\src\\IO\\JavaIO\\IOStream\\IO流体系图03.PNG";

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;


        try {
            fileInputStream = new FileInputStream(srcfilePath); //节点流
            fileOutputStream = new FileOutputStream(dstfilePath);
            bufferedInputStream = new BufferedInputStream(fileInputStream);  //处理流，装饰者模式
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            //循环拷贝
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = bufferedInputStream.read(bytes)) != -1) {
                //读一部分写一部分
                bufferedOutputStream.write(bytes, 0, len);//缓冲机制
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedInputStream.close(); //关闭外层处理流即可，会自动关闭里面的节点流
                bufferedOutputStream.close();
               /* if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }*/
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        System.out.println("copy完成");


    }
}
