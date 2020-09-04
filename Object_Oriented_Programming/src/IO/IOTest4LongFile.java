package IO;

import java.io.*;

/**
 * @author wyl
 * @create 2020-08-07
 * @Description  字节流
 * @Version
 */
public class IOTest4LongFile {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream =new FileInputStream("E:\\IDEA_Project\\new\\Test\\Object_Oriented_Programming\\assets\\Originalhello.txt");
            fileOutputStream =new FileOutputStream("E:\\IDEA_Project\\new\\Test\\Object_Oriented_Programming\\assets\\Afterhello.txt");
            byte buffer[]=new byte[1024];
            while (true){
                int temp = fileInputStream.read(buffer, 0, buffer.length);
                if (temp==-1){
                    System.out.println("读写完成");
                    break;
                }
                fileOutputStream.write(buffer,0,temp);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                if((fileInputStream!=null)&&(fileOutputStream!=null)){
                    fileInputStream.close();
                    fileOutputStream.close();
                }

            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
