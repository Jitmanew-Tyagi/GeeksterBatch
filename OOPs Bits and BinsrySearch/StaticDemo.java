import java.util.*;

class Test {
    static int x = 0;
    int y = 5;
    
    public static void display() {
        System.out.println("Display method called");
    }
}

public class StaticDemo {

    public static void main(String[] args) {
        // Test.display();
        Test t1 = new Test();
        // Test t2 = new Test();
        // System.out.println(t1.x);
        // System.out.println(t2.x);
        // t1.x = 5;
        // System.out.println(t1.x);
        // System.out.println(t2.x);
        // t2.x = 6;
        // System.out.println(t1.x);
        // System.out.println(t2.x);
    }
}