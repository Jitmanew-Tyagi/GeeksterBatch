import java.util.*;

interface iFirst {
    void display();
}

interface iSecond {
    void display();
}

class Test implements iFirst, iSecond {
    public void display() {
        System.out.println("Display method called");
    }
}

public class InterfaceSameMethod {
    public static void main(String[] args) {
        Test t = new Test();
        t.display();
    }
}