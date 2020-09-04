package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author wyl
 * @create 2020-08-07
 * @Description 字符流
 * @Version
 */
public class IOTest02 {
    public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            fileReader = new FileReader("E:\\IDEA_Project\\new\\Test\\Object_Oriented_Programming\\assets\\OriginalhelloChar.txt");
            fileWriter = new FileWriter("E:\\IDEA_Project\\new\\Test\\Object_Oriented_Programming\\assets\\Afterhello.txt");

            char buffer[] = new char[16];
            while (true) {
                int temp = fileReader.read(buffer, 0, buffer.length);
                if (temp == -1)
                    break;
                fileWriter.write(buffer,0,temp);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {

            try {
                fileReader.close();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
