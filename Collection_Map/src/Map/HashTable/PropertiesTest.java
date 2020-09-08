package Map.HashTable;

import java.io.*;
import java.util.Iterator;
import java.util.Properties;

/**
 * @author wyl
 * @create 2020-09-08
 * @Description
 * @Version
 */
public class PropertiesTest {
    public static void main(String[] args) {
        //创建一个Properties对象，按照key-value来进行管理
        Properties properties = new Properties();
        InputStream in = null;
        try {
             in = new BufferedInputStream(new FileInputStream("E:\\IDEA_Project\\new\\JavaSETest\\Collection_Map\\src\\Map\\HashTable\\my.properties"));
            properties.load(in);//加载属性列表
            Iterator<String> iterator = properties.stringPropertyNames().iterator();
            while (iterator.hasNext()){
                String key = iterator.next();
                System.out.println(key+":"+properties.getProperty(key));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
