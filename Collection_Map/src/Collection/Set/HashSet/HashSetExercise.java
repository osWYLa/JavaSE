package Collection.Set.HashSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author wyl
 * @create 2020-09-08
 * @Description
 *              HashSet只是提供关于重复对象的一套机制，具体实现起来还是看有没有实现hashCode方法和wquals方法。
 *              没有重写依然走Object的默认方法，达不到效果。必须要重写，再动态绑定
 * @Version
 */
@SuppressWarnings("ALL")
public class HashSetExercise {
    public static void main(String[] args) {
        Set hashSet = new HashSet();
        MyDate myDate = new MyDate(1994, 2, 8);
        MyDate myDate1 = new MyDate(1995, 2, 7);
        MyDate myDate2 = new MyDate(1996, 2, 9);
        hashSet.add(new Employee("Jack",20,myDate));
        hashSet.add(new Employee("Yuye",23,myDate1));
        hashSet.add(new Employee("wyl",25,myDate2));
        hashSet.add(new Employee("wyl",25,myDate2));

       // hashSet.add(new Employee("wyl",25,new MyDate(1996,2,9)));
        System.out.println(hashSet);
    }
}
class Employee {

    private String name;
    private int age;
    private MyDate birthday;

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

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }
    //按照要求name 和birthday内容相同就要保证hashCode和equals相等


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name) &&
                birthday.equals(employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
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
class  MyDate{
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

    //如果属性year、month、day都相同，需要保证hashCode 和 equals都相同


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year &&
                month == myDate.month &&
                day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
