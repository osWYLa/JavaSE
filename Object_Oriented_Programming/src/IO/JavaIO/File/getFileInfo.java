package IO.JavaIO.File;

import java.io.File;

/**
 * @author wyl
 * @create 2020-09-11
 * @Description 获取文件相关信息：getName,getAbsolutePath,getParent,length,exists,isFile,isDirectory
 * @Version
 */
public class getFileInfo {
    public static void main(String[] args) {
        String address = "E:\\IDEA_Project\\new\\JavaSETest\\Object_Oriented_Programming\\src\\IO\\JavaIO\\File\\";
        String fileName = "a.txt";
        File file = new File(address + fileName);
        System.out.println("getName---"+file.getName());
        //绝对路径
        System.out.println("getAbsolutePath-----"+file.getAbsolutePath());
        //getParent获取父目录
        //length文件大小
        //一些属性判断
    }
}
