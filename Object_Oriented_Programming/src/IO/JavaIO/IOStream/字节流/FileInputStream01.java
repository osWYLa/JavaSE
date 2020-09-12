package IO.JavaIO.IOStream.字节流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author wyl
 * @create 2020-09-12
 * @Description
 * @Version
 */
public class FileInputStream01 {
    public static void main(String[] args) throws Exception {
        //使用FileInputStream读取hello.txt文件，并将文件内容显示到控制台

        String filePath = "E:\\IDEA_Project\\new\\JavaSETest\\Object_Oriented_Programming\\src\\IO\\JavaIO\\IOStream\\hello.txt";
        FileInputStream fileInputStream = new FileInputStream(filePath);

        /*int data;
        //第一种方式：单个字节
        while ( (data= fileInputStream.read())!=-1){
            System.out.print((char)data);    //汉字乱码，字节流按字节读取一个汉字字符，UTF-8编码是两个字节，单个字节输出有问题的
        }*/

        System.out.println("============");
        //第二种方式：字节数组(需要屏蔽第一种，FileInputStream只能用一次？)
        byte[] bytes = new byte[1024];
        int len= 0;
        //fileinputStream从文件中一次最多读取1024，实际读到的为len
        while ((len = fileInputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len)); //0 一定需要
        }


        //关闭流
        fileInputStream.close();



    }
}
