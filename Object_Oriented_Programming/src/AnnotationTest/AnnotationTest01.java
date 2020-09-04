package AnnotationTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wyl
 * @create 2020-08-31
 * @Description
 * @Version
 */

public class AnnotationTest01 {
    public static void main(String[] args) {
        new B("yuye").f2();
        List<String> arrayList = new ArrayList();
    }
}

class A{
    private String name ;

    public A(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void f1(){
        System.out.println("f1...");
    }
    @Deprecated
    public void f2(){
        System.out.println("f2...");
    }
}
class B extends A{
    public B(String name) {
        super(name);
    }

    @Override
    public void f1() {
        super.f1();
    }
}