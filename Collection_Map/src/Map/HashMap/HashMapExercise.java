package Map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author wyl
 * @create 2020-09-08
 * @Description
 * @Version
 */
@SuppressWarnings("ALL")
public class HashMapExercise {
    public static void main(String[] args) {
        Employee employee = new Employee("yuye", 110, 12500);
        Employee employee1 = new Employee("yuye1", 111, 12600);
        Employee employee2 = new Employee("yuye2", 112, 19600);
        Employee employee3 = new Employee("yuye3", 113, 19800);

        Map hashMap = new HashMap();
        hashMap.put(employee.getId(),employee); //第一个参数自动装箱
        hashMap.put(employee1.getId(),employee1);
        hashMap.put(employee2.getId(),employee2);
        hashMap.put(employee3.getId(),employee3);
        //遍历
        //方式一：
        Set set = hashMap.keySet();
        System.out.println(set);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Object key = iterator.next();
            Employee e = (Employee)hashMap.get(key);
            if (e.getSalary()>18000){
                System.out.println("key: "+key);
            }
        }

        System.out.println("==============");
        //方式二：
        Set set1 = hashMap.entrySet();
        System.out.println(set1);
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()){
            Map.Entry node = (Map.Entry)iterator1.next();
            Employee  e1 =(Employee) node.getValue();
            if (e1.getSalary()>18000){
                System.out.println("key: "+node.getKey());
            }

           // System.out.println(node.getKey()+":::"+node.getValue());

        }

    }
}
class Employee{
    private String name;
    private int id;
    private float salary;

    public Employee(String name, int id, float salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}