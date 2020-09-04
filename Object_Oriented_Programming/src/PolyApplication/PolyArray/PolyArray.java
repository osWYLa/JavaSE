package PolyApplication.PolyArray;

/**
 * @author wyl
 * @create 2020-08-11
 * @Description
 * @Version
 */
public class PolyArray {
    public static void main(String[] args) {
        //包含向上转型
        Person person[] = {new Person("Person1", 10),
                new Student("tom", 20, 100), new Student("king", 21, 90),
                new Teacher("王老师", 50, 10000), new Teacher("张老师", 51, 12000)};
        //向上转型后如何调用原先子类有的方法呢？——向下转型
        //对于多态数组可以使用instanceof+向下转型进行多态数组遍历
            //这里可以封装成方法

        PolyArray polyArray = new PolyArray();
        polyArray.fun(person);
    }
    //封装方法
public void fun(Person[] person){
    for (int i = 0; i < person.length; i++) {
        //遍历取出数组元素，判断运行类型
        if (person[i] instanceof Student) {
            //向下转型
            Student student = (Student) person[i];
            student.study();
            //((Student) person[i]).study();
        }
        else if (person[i] instanceof Teacher) {
            ((Teacher) person[i]).teach();
        }
        else{
            System.out.println(person[i].say());
        }
    }
}

}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
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

    public String say() {
        return "信息 name= " + name + " age= " + age;
    }
}

class Student extends Person {
    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void study() {
        System.out.println("学生 " + getName() + " 正在学习。。。");
    }
}

class Teacher extends Person {
    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void teach() {
        System.out.println("老师 " + getName() + " 正在上课");
    }
}