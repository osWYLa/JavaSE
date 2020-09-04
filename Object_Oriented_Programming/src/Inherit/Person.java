package Inherit;

/**
 * @author wyl
 * @create 2020-08-05
 * @Description
 * @Version
 */
public class Person {
        public Person() {
            System.out.println("Person 无参数构造函数");
        }

        public Person(String name) {
            this.name = name;
            System.out.println("Person 一个参数构造函数");
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println("Person 两个参数的构造函数");
        }

        String name;
        int age;
        void eat(){
            System.out.println("eat....");
        }
        void introduce(){
            System.out.println("introduce...");
        }


}
