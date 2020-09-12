package IO.JavaIO.IOStream.字符流.ConversionStream;

import java.io.*;

/**
 * @author wyl
 * @create 2020-09-12
 * @Description 转换流 InputStreamReader OutputStreamWriter(可以指定编码格式)
 * 1）InputStreamReader: Reader 的子类，实现将InputStream（字节流）包装成Reader(字符流)
 * 2)OutputStreamWriter:Writer的子类，实现将OutputStream（字节流）包装成Writer（字符流）
 * 3)当处理纯文本数据时，使用字符流效率更高，并且可以有效解决中文问题，所以建议将字节流转换成字符流
 * 4)可以在使用时指定编码格式（比如utf-8,gb2312,ISO8859-1等）
 * @Version
 */
public class ConversionStreamTest {
    //目标，将字节流 FileInputStream包装成（转换成）字符流InputStreamReader,对文件进行读取（按照UTF-8格式），进而再包装成BufferedReader
    public static void main(String[] args) throws Exception {
        String desfilePath = "E:\\IDEA_Project\\new\\JavaSETest\\Object_Oriented_Programming\\src\\IO\\JavaIO\\IOStream\\temp\\hello.txt";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(desfilePath), "utf-8"));
        String line="";
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        bufferedReader.close();
        System.out.println("ok");


        //写入测试
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(desfilePath,true), "utf-8");
        outputStreamWriter.write("hello，设计模式12");
        outputStreamWriter.close();
        System.out.println("ok");

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(desfilePath,true), "utf-8"));
        bufferedWriter.write("你好，设计模式");
        bufferedWriter.close();
        System.out.println("保存成功");

    }
}
