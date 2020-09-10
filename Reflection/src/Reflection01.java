import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author wyl
 * @create 2020-09-10
 * @Description
 * @Version
 */
public class Reflection01 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException {
        //使用反射调用Student类中的hi()方法
            //获取Student的Class 对象(动态创建)
                //方式1
                Class<?> studentClass = Student.class; //Student.class 类型是Class
        Object instance = studentClass.newInstance(); //使用这个Class对象的newInstance方法，会调用Student的无参构造函数，生成一个Student对象，即此处的instance.
        System.out.println(instance.getClass());
        Student student = (Student)instance; //向下转型，仅示意，可和上面合并

        //每个类的实例都会知道自己是由哪个Class实例所生成的
        System.out.println(studentClass == student.getClass());


        //调用Student类中的hi()方法
     //   Method hi_p_method = studentClass.getMethod("hi()", int.class);//参数入口，为防止在Student中有方法重载，用以区分
        Method hi_np_method1 = studentClass.getMethod("hi");
        Method hi_p_method = studentClass.getMethod("hi", int.class);

        hi_p_method.invoke(student,2);
        hi_np_method1.invoke(student);
                //方式2
        Class<?> aClass = Class.forName("Student");  //如何确定某个类的全类名？如何跨模块调用其他类？

        Student s = (Student)aClass.newInstance();
        System.out.println(aClass==s.getClass());
                //方法3
         s.getClass();
                //方法4
       /* ClassLoader classLoader = this.getClass().getClassLoader();
        Class<?> class4 = classLoader.loadClass("类的全类名");*/

        System.out.println("ok");


    }
}

class  Student{
    //权限设置为public
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //使用反射需要无参构造器
    public Student() {
        System.out.println("调用Student无参构造");
    }
    public void hi(){
        System.out.println("hi...");
    }
    public void hi(int i){
        System.out.println("hi..."+i);
    }

    public void f1(){
        System.out.println("f1...");
    }
}