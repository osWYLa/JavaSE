package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author wyl
 * @create 2020-08-07
 * @Description  字符流 单次读取
 * @Version
 */
public class IOtest001 {
    public static void main(String[] args) {
        FileReader fileReader=null;
        FileWriter fileWriter=null;

        try {
            fileReader = new FileReader("E:\\IDEA_Project\\new\\Test\\Object_Oriented_Programming\\assets\\OriginalhelloChar.txt");
            fileWriter = new FileWriter("E:\\IDEA_Project\\new\\Test\\Object_Oriented_Programming\\assets\\Afterhello.txt");

            char buffer[]=new char[16];
            fileReader.read(buffer,0,buffer.length);

            for (int i =0;i<buffer.length;i++)
                System.out.print(buffer[i]);

        } catch (IOException e) {
            System.out.println(e);
        }finally {
            try {
                fileReader.close();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
