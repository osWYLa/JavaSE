import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author wyl
 * @create 2020-09-09
 * @Description
 * @Version
 */
public class GenericExercise02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("A",22,new MyDate(1996,2,9)));
        employees.add(new Employee("B",25,new MyDate(1995,2,8)));

        //排序
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        //遍历
        for (Employee e :
                employees) {
            System.out.println(e);
        }
        //排序
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(!(o1.getName().equals(o2.getName())))
                {
                    return o1.getName().compareTo(o2.getName());
                }
                //可以封装，让MyDate实现Comparable接口
                /*if (o1.getBirthday().getYear()!=o2.getBirthday().getYear()){
                    return o1.getBirthday().getYear()-o2.getBirthday().getYear();
                }
                if (o1.getBirthday().getMonth()!=o2.getBirthday().getMonth()){
                    return o1.getBirthday().getMonth()-o2.getBirthday().getMonth();
                }
                else return o1.getBirthday().getDay() - o2.getBirthday().getDay();*/

                else return o1.getBirthday().compareTo(o2.getBirthday());

            }
        });
        //遍历
        for (Employee e :
                employees) {
            System.out.println(e);
        }


    }
}
class Employee{
    private String name;
    private int age;
    private MyDate birthday;

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}


class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {
        if (year!=o.year) return year-o.year;
        if (month!=o.month)return month-o.month;
        else return day-o.day;
    }
}