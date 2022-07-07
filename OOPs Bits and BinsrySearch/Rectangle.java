import java.util.*;

public class Rectangle{
    int length;
    int breadth;

    Rectangle () {
        System.out.println("RECT, NON PARAM");
    }
    
    Rectangle (int val) {
        System.out.println("RECT, ONE PARAM");
        setLength(val);
        setBreadth(val);
    }
    
    Rectangle (int l, int b) {
        System.out.println("RECT, TWO PARAM");
        setLength(l);
        setBreadth(b);
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setLength(int len) {
        if(len < 0) System.out.println("len must be > 0");
        else length = len;
    }
    
    public void setBreadth(int bread) {
        if(bread < 0) System.out.println("breadth must be > 0");
        else breadth = bread;
    }

    public int area() {
        return length * breadth;
    }
}