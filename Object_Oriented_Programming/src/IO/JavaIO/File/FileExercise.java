package IO.JavaIO.File;

import java.io.File;
import java.io.IOException;

/**
 * @author wyl
 * @create 2020-09-12
 * @Description
 * @Version
 */
public class FileExercise {
    public static void main(String[] args) throws IOException {
        String address = "E:\\IDEA_Project\\new\\JavaSETest\\Object_Oriented_Programming\\src\\IO\\JavaIO\\File\\tempTest\\";
        File file = new File(address);
        if (!file.exists()){
            if(file.mkdirs()) System.out.println("TempTest 创建成功");
            else System.out.println("创建失败");
        }else System.out.println("TempTest 文件夹 exist!");

        String fileName = "hello.txt";
        File file1 = new File(file ,fileName);//父级目录方式
        if(!file1.exists()){
            if (file1.createNewFile()) {
                System.out.println("文件创建成功！");
            }else System.out.println("文件创建失败");
        }else System.out.println("目标文件已存在");

       // deleteFile(file);
    }


    //文件遍历删除（递归删除）
    public static void deleteFile(File file){
        //判断文件不为null或文件目录存在
        if (file == null || !file.exists()){
            System.out.println("文件删除失败，请假查文件路径是否正确");
        }
        //获取此目录下的所有子文件对象
        File[] files = file.listFiles();

        //遍历
        for (File f :
                files) {
            //打印文件名
            String name = file.getName();
            System.out.println(name);
            //判断子目录是否存在子目录，如果是文件则删除
            if (f.isDirectory()){
                deleteFile(f);
            }else f.delete();
        }
        file.delete();
    }
}
