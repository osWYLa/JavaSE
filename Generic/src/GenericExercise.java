import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author wyl
 * @create 2020-09-09
 * @Description
 * @Version
 */
public class GenericExercise {
    public static void main(String[] args) {
        HashMap<String, Student> stringStudentHashMap = new HashMap<>();
        stringStudentHashMap.put("A",new Student("A"));
        stringStudentHashMap.put("B",new Student("B"));
        //遍历
            //方式1：
        Set<String> keys = stringStudentHashMap.keySet();
        for (String key :
                keys) {
            System.out.println(key+":"+stringStudentHashMap.get(key));
        }
        System.out.println("=====================");
            //方式2：
        Set<Map.Entry<String, Student>> entries = stringStudentHashMap.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Student> node = iterator.next();
            System.out.println(node.getKey()+":"+node.getValue());

        }


    }
}
class Student{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
