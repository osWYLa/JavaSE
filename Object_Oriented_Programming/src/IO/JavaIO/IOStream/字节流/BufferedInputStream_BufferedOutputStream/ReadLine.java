package IO.JavaIO.IOStream.字节流.BufferedInputStream_BufferedOutputStream;

import java.io.*;

/**
 * @author wyl
 * @create 2020-09-12
 * @Description
 * @Version
 */
public class ReadLine {
    public static void main(String[] args) throws Exception {
        String desfilePath = "E:\\IDEA_Project\\new\\JavaSETest\\Object_Oriented_Programming\\src\\IO\\JavaIO\\IOStream\\temp\\hello.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(desfilePath));
        String line;
        while ((line = bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        //关闭流
        bufferedReader.close();

        //按行写文件
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(desfilePath));
        bufferedWriter.write("444");//这里想实现换行，不推荐使用手动写入\r\n，不同系统对于换行定义不同，使用方法插入换行
        bufferedWriter.newLine();
        bufferedWriter.write("555");
        bufferedWriter.newLine();
        bufferedWriter.write("666");
        bufferedWriter.newLine();

        bufferedWriter.close();


    }
}
