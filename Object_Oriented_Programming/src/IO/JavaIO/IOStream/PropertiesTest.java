package IO.JavaIO.IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Properties;

/**
 * @author wyl
 * @create 2020-09-12
 * @Description 工具类
 * @Version
 */
public class PropertiesTest {
    public static void main(String[] args) throws Exception {
        String srcfilePath = "E:\\IDEA_Project\\new\\JavaSETest\\Object_Oriented_Programming\\src\\IO\\JavaIO\\IOStream\\temp\\my.properties";
        //记得去设置文件的编码格式
        Properties properties = new Properties();
        properties.load(new FileReader(srcfilePath));

        properties.list(System.out);
        //根据键获取
        String name = properties.getProperty("name");
        String ip = properties.getProperty("ip");
        System.out.println(name+"\t"+ip);

        properties.clear();

        //写入演示：
        properties.setProperty("charset","utf-8");
        properties.setProperty("address","天津");
        properties.store(new FileOutputStream(srcfilePath,true),"这是注释...");


    }
}
