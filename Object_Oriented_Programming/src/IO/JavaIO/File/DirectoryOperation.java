package IO.JavaIO.File;

import org.junit.Test;

import java.io.File;

/**
 * @author wyl
 * @create 2020-09-12
 * @Description
 * @Version
 */
public class DirectoryOperation {
    public static void main(String[] args) {

    }

    @Test
    public void m1(){
        //判断文件是否存在，存在就删除  delete
        String address = "E:\\IDEA_Project\\new\\JavaSETest\\Object_Oriented_Programming\\src\\IO\\JavaIO\\File\\";
        String fileName = "a.txt";
        File file = new File(address + fileName);
        System.out.println(file.delete());
    }
    @Test
    public void m2(){
        //判断目录是否存在,存在删除   exist
        String address = "E:\\IDEA_Project\\new\\JavaSETest\\Object_Oriented_Programming\\src\\IO\\JavaIO\\File\\Tsefaf";
        File file = new File(address );
        if(file.exists()){
            file.delete();
        }
    }
    @Test
    public void m3(){
        //判断目录是否存在，不存在创建 mkdirs(多级)、mkdir(单级)
        String address = "E:\\IDEA_Project\\new\\JavaSETest\\Object_Oriented_Programming\\src\\IO\\JavaIO\\File\\003";
        File file = new File(address);
        if (!file.exists()){
            file.mkdir();
                System.out.println("ok");
        }
        else{
            System.out.println("exist");
        }

    }
}
