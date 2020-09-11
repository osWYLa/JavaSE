import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author wyl
 * @create 2020-09-11
 * @Description 通过反射访问类中的成员
 *              1、根据属性名获取Field对象； Field f =  clazz对象.getDeclaredField(属性名)
 *              2、爆破 ： f.setAccessible(true);
 *              3、访问： f.set(0,value);
 *              4、如果是静态属性，则set和get中的参数o，可以写成null
 *
 * @Version
 */
public class ReflectionExercise {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        //得到Class对象
        Class<?> userClazz = Class.forName("User");
        //无参构造器
        Object o = userClazz.newInstance();


        Field nameField = userClazz.getDeclaredField("name");
        //爆破 字段
        nameField.setAccessible(true);
        nameField.set(o,"java");
        System.out.println(o.toString());

        //有参构造器
        Constructor<?> declaredConstructor = userClazz.getDeclaredConstructor(String.class, int.class);
        //爆破构造器
        declaredConstructor.setAccessible(true);
        Object yuye = declaredConstructor.newInstance("yuye", 25);
        System.out.println(yuye);
        nameField.set(yuye,"yuye1");//字段前面已经爆破过了
        System.out.println(yuye);


        System.out.println("==========");
        //对象
        User user = new User();

        //使用反射调用
        Class<User> userClass = User.class;
        Method hiMethod = userClass.getMethod("hi", String.class);
        Object invoke = hiMethod.invoke(user,"hello");

        Method sayMethod = userClass.getDeclaredMethod("say", String.class, int.class, char.class);
        //私有爆破
        sayMethod.setAccessible(true);
        Object invoke1 = sayMethod.invoke(null, "测试", 100, '汉');//静态方法直接对象传入null即可
        System.out.println(invoke1);


    }
}

class User{
    private String name;
    private int age;

    private static String say(String s,int i,char c){

        return "静态say 方法"+s+i+c;
    }

    public void hi(String s){

        System.out.println("hi方法 "+s);
    }

    public User() {
    }

    public User(String name, int age) {
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
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
