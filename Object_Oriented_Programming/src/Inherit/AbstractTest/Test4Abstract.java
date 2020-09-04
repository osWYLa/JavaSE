package Inherit.AbstractTest;

import Inherit.Person;

/**
 * @author wyl
 * @create 2020-08-05
 * @Description
 * @Version
 */
public class Test4Abstract {
    public static void main(String[] args) {
        //注意，无法使用new 创建Person对象
        //可以使用向上转型
        Person_Abstract person_abstract= new Chinese("yuye",20);
        person_abstract.eat();
        person_abstract.introduce();



    }


}
