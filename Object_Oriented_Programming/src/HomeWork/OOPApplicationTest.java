package HomeWork;


import com.sun.media.sound.SoftTuning;

/**
 * @author wyl
 * @create 2020-08-19
 * @Description
 * @Version
 */
public class OOPApplicationTest {
    public static void main(String[] args) {
        Person person[] = {new Student("zhangsan", 20, '男', 110),
                new Student("lisi", 20, '男', 111),
                new Teacher("zhanT", 50, '男', 10),
                new Teacher("LiT", 52, '女', 12)};

        Teacher teacher = new Teacher("Tian", 40, '男', 13);
        //teacher.printInfo();
        System.out.println(teacher);
        System.out.println("--------------------");

        Student student = new Student("yuye", 24, '男', 1920190306);
       // student.printInfo();
    }
}

class Person {
    private String name;
    private int age;
    private char gender;

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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String play() {
        return "";
    }
    //输出基本信息,父类完成
    public void printBasicInfo(){
        System.out.println("姓名： "+getName()+"\n"+"年龄： "+getAge()+"\n"+"性别： "+ getGender());
    }

  
}


class Student extends Person {

    private int stu_id;

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public Student(String name, int age, char gender, int stu_id) {
        super(name, age, gender);
        this.stu_id = stu_id;
    }

    public void study() {
        System.out.println("我承诺好好学习");
    }

    @Override
    public String play() {
        return "学生 " + getName() + "爱玩足球";
    }
    public void printInfo(){
        System.out.println("学生的信息是：");
        printBasicInfo();
        System.out.println("学号： "+getStu_id());
        study();
        play();
    }

}

class Teacher extends Person {

    private int work_age;

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public Teacher(String name, int age, char gender, int work_age) {
        super(name, age, gender);
        this.work_age = work_age;
    }

    public void teach() {
        System.out.println("我承诺好好教学");
    }

    @Override
    public String play() {
        return "老师 " + getName() + "爱玩象棋";
    }
    public void printInfo(){
        System.out.println("老师的信息是：");
        printBasicInfo();
        System.out.println("工龄： "+getWork_age());
        teach();
        play();
    }


}
