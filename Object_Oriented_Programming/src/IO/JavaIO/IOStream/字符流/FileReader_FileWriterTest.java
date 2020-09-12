package IO.JavaIO.IOStream.字符流;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author wyl
 * @create 2020-09-12
 * @Description
 * @Version
 */
public class FileReader_FileWriterTest {
    //从temp//hello.txt中读取
    public static void main(String[] args) throws IOException {
        String srcfilePath = "E:\\IDEA_Project\\new\\JavaSETest\\Object_Oriented_Programming\\src\\IO\\JavaIO\\IOStream\\temp\\hello.txt";
        FileReader fileReader=null;
        try {
            fileReader= new FileReader(srcfilePath);
            char[] buffer = new char[1024];
            int len=0;
            while ((len = fileReader.read(buffer))!=-1){
                System.out.println(new String(buffer,0,len));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            fileReader.close();
        }

        FileWriterTest();
    }
    public static void FileWriterTest() throws IOException {
        String desfilePath = "E:\\IDEA_Project\\new\\JavaSETest\\Object_Oriented_Programming\\src\\IO\\JavaIO\\IOStream\\temp\\hello.txt";
        String srcfilePath = "E:\\IDEA_Project\\new\\JavaSETest\\Object_Oriented_Programming\\src\\IO\\JavaIO\\IOStream\\temp\\hello.txt";
        //如果目录存在但是文件不存在，会自动创建
        FileWriter fileWriter = new FileWriter(desfilePath,true); //只有Writer有追加，reader没有
        FileReader fileReader = new FileReader(srcfilePath);
        char[] buffer = new char[1024];
        int len = 0;
        while ((len =fileReader.read(buffer))!=-1){
            System.out.println(new String(buffer,0,len));
            fileWriter.write("2222222\r\n");
            fileWriter.write(buffer,0,len);
            fileWriter.write("\n");
        }
        fileWriter.flush();  //必须刷进去否则没法写到文件
        //fileWriter.close(); //先flush再close
        fileReader.close();

    }

}
