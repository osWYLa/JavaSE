package IO.JavaIO.IOStream.字节流.ObjectStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author wyl
 * @create 2020-09-12
 * @Description
 * @Version
 */
public class ObjectOutStreamTest {
    public static void main(String[] args) throws Exception {
        String desfilePath = "E:\\IDEA_Project\\new\\JavaSETest\\Object_Oriented_Programming\\src\\IO\\JavaIO\\IOStream\\temp\\data.dat";

        Dog tom = new Dog("tom", 3);
        //将tom保存到文件data.dat ，就算写到txt文件写的，写的也是二进制文件，不可能是文本。按字节写的（后缀其实不重要？文件上传下载）
        //保存对象————>序列化
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(desfilePath));
        objectOutputStream.writeObject(tom); //如果DOG类没有实现Serializable接口，会报异常

        //测试顺序
        objectOutputStream.writeInt(100);


        objectOutputStream.close();
        System.out.println("完成");
    }
}
class Dog implements Serializable {
    private static final long serialVersionUID = 4644735329543998614L;
    private String name;
    private transient int age; //Integer

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
