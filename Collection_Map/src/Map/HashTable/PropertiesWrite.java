package Map.HashTable;

import java.io.*;
import java.util.Iterator;
import java.util.Properties;

/**
 * @author wyl
 * @create 2020-09-09
 * @Description
 * @Version
 */
public class PropertiesWrite {
    public static void main(String[] args) {
        //创建一个Properties对象，按照key-value来进行管理
        Properties properties = new Properties();
        FileOutputStream out = null;
        InputStream in = null;
        try {
            out = new FileOutputStream("E:\\\\IDEA_Project//new//////JavaSETest\\Collection_Map\\src\\Map\\HashTable\\my.properties",true);
            properties.setProperty("phone","10086");//增加
            properties.store(out,"The new add message...."); //添加注释，为空也可，还用时间注释



            in = new BufferedInputStream(new FileInputStream("E:\\\\IDEA_Project//new//////JavaSETest\\Collection_Map\\src\\Map\\HashTable\\my.properties"));
            properties.load(in);
            Iterator<String> iterator = properties.stringPropertyNames().iterator();
            while (iterator.hasNext()){
                String key = iterator.next();
                System.out.println(key+":"+properties.get(key));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
