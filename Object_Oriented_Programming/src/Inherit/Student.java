package Inherit;

/**
 * @author wyl
 * @create 2020-08-05
 * @Description
 * @Version
 */
class Student extends Person {
    public Student() {

        super();
        // super("yuye",20);//放在第一句，调用父类无参构造函数。子类构造函数若没有调用父类构造函数，编译器会自动补上
        System.out.println("Student的无参数构造函数");
    }

    public Student(int grade) {
        this.grade = grade;
    }

    //使用快捷键的时候，可以选择对应哪个父类构造函数
    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    int grade;
    void study(){
        System.out.println("study....");
    }

    //复写
    @Override
    void introduce() {
        super.introduce();
        System.out.println("i am in "+grade +" .");
    }
}
