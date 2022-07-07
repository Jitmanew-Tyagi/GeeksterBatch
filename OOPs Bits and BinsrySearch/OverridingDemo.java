import java.util.*;

class Parent {
    public void walk() {
        System.out.println("parent class : walking");
    }
    public void talk() {
        System.out.println("parent class : talking");
    }
    public void invest() {
        System.out.println("parent class : all hail FD");
    }
}

class Child extends Parent{

    @Override
    public void invest() {
        System.out.println("child class : all hail FD");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Parent par = new Parent();
        par.walk();
        Child child = new Child();
        child.walk();
        par.invest();
        child.invest();
        Parent obj = new Child();
        obj.invest();
    }
}