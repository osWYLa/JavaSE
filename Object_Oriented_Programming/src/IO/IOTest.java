package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author wyl
 * @create 2020-08-07
 * @Description
 * @Version
 */
public class IOTest {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            // \\和/ 效果一样？
            fileInputStream =new FileInputStream("E:\\IDEA_Project\\new\\Test\\Object_Oriented_Programming\\assets\\Originalhello.txt");
            fileOutputStream =new FileOutputStream("E:\\IDEA_Project\\new\\Test\\Object_Oriented_Programming\\assets\\Afterhello.txt");


            byte buffer[] = new byte[16];
            int temp = fileInputStream.read(buffer, 0, buffer.length);

         //   fileOutputStream.write(buffer,0,temp);

            /* \n:  UNIX 系统行末结束符
               \n\r: window 系统行末结束符
               \r:  MAC OS 系统行末结束符
               目前采用UTF-8编码，一个汉字占三个字节（这里使用字节数组按字节读取），打印出13 10 注意看，文本中是不是有很多 行末结束符（Win）
            */
            for (int i=0;i<buffer.length;i++) {
                System.out.println(buffer[i]);
            }



            /*String s =new String(buffer);
            System.out.println(s);
            System.out.println("=====================");
            System.out.println(s.trim());*/




        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
