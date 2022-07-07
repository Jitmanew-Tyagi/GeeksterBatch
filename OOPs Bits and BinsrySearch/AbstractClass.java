import java.util.*;

abstract class Shape {
    Shape() {
        System.out.println("Constructor of parent");
    }

    void shapesMethod () {
        System.out.println("implemrnted method of abstract class");
    }

    abstract float perimeter();
    abstract float area();
}

class Rectangle extends Shape {
    int length, bredth;

    Rectangle(int length, int bredth) {
        this.length = length;
        this.bredth = bredth;
    }

    float area() {
        return length * bredth;
    } 

    float perimeter() {
        return 2 * (length + bredth);
    }
}


public class AbstractClass {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 4);
        rect.shapesMethod();
        System.out.println(rect.area());
        System.out.println(rect.perimeter());
    }
}