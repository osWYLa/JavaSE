package ReflectionFile;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author wyl
 * @create 2020-09-11
 * @Description
 * @Version
 */
public class ReflectionFileTest {
    public static void main(String[] args) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //传统方式
        File file = new File("E:\\IDEA_Project\\new\\JavaSETest\\Reflection\\src\\ReflectionFile\\test.txt");
        boolean newFile = file.createNewFile(); //真正创建文件

        //反射方式
        Class<File> fileClass = File.class;
        String filename = "E:\\IDEA_Project\\new\\JavaSETest\\Reflection\\src\\ReflectionFile\\testReflection.txt";
        // File file = fileClass.newInstance(); 不行，需要File的有参构造器
        //得到有参构造器
        Constructor<?> constructor = fileClass.getConstructor(String.class); //如果是Constructor<File>则在下一步返回File，不需要转型和反射获取createNewFIle()，这里只是演示
        Object o = constructor.newInstance(filename);

        //这里不是已经可以直接使用file.createNewFile()?为什么还需要使用反射 boolean newFile = file.createNewFile();
            //使用反射得到createNewFile方法 对象
        Method createNewFileMethod = fileClass.getMethod("createNewFile"); //该方法没有参数
         createNewFileMethod.invoke(o);
        System.out.println("创建成功");


    }
}
