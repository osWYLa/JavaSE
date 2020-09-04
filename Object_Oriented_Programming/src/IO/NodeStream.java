package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author wyl
 * @create 2020-08-07
 * @Description 使用装饰者模式，按行读
 * @Version
 */
public class NodeStream {
    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("E:\\IDEA_Project\\new\\Test\\Object_Oriented_Programming\\assets\\OriginalhelloChar.txt");
            //使用处理流时，都必须有节点流
            bufferedReader =new BufferedReader(fileReader);
            String line = null;
            while (true){
                line = bufferedReader.readLine();
                if (line == null){
                    break;
                }
                System.out.println(line);
            }


        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }


    }
}
