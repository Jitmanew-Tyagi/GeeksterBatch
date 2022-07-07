import java.util.*;

class Parent {
    void method1 () {
        System.out.println("Parent method");
    }
    void method3() {
        System.out.println("Parent method 3");
    }
}

class Child extends Parent {
    @Override
    void method1() {
        System.out.println("Child method");
    }
    
    void method2() {
        System.out.println("Child method2");
    }
}


public class Refrencing {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.method1();
        // obj.method2();
        obj.method3();
    }
}