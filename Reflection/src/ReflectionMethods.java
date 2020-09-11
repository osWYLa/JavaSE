import java.lang.reflect.Field;
import java.lang.reflect.Method;


/**
 * @author wyl
 * @create 2020-09-10
 * @Description
 * @Version
 */
public class ReflectionMethods {
    public static void main(String[] args) throws ClassNotFoundException {
       /* *//*Class<?> personClass = Class.forName("ReflectionMethods.Person");
        System.out.println(personClass.getName());*//*

        Class<?> abc = Class.forName("AABBCC.ABCABC");
        Class<?> abc1 = Class.forName("ABC");
        System.out.println("success");*/

        //得到Class对象
        Class<?> personClass = Class.forName("ReflectionMethods.Person");  //全类名直到包级别，到不了Module和Project级别
        //获取全类名getName
        System.out.println("获取全类名:"+personClass.getName());
        //获取简单类名
        System.out.println("获取简单类名:"+personClass.getSimpleName());
        //获取所有public修饰的属性，包括本类和父类getFields
        Field[] fields = personClass.getFields();
        for (Field f :
                fields) {
            System.out.println("public字段："+f.getName());
        }
        //获取本类中所有属性getDeclareFields
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field f :
                declaredFields) {
            System.out.println("所有字段/属性："+f.getName());
        }
        //获取所有public修饰的方法，包含本类以及父类的getMethods
        Method[] methods = personClass.getMethods();
        for (Method m :
                methods) {
            System.out.println("方法名；"+m.getName());
        }
        //获取本类中的所有方法
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method m :
                declaredMethods) {
            System.out.println("本类中的方法："+m.getName());
        }
        //获取本类和父类 getConstructor/ 本类的构造器getDeclaredMethods   (获取构造器的时候，默认的构造器是不会出现的，只出现写了的构造器)

        //以package形式返回 包信息
        Package aPackage = personClass.getPackage();
        System.out.println(aPackage.getName());

        //以Class形式返回父类信息getSuperClass
        //以Class[] 形式返回接口信息 ； getInterface
        Class<?>[] interfaces = personClass.getInterfaces();  //Person 实现了IA接口；这里可以看出接口也是一种类

        //注解信息可以获取 getAnnotation 以Annotation[] 形式返回注解

    }
}

