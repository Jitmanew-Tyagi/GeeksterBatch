import java.util.*;

public class Client {
    public static void main(String[] args) {
        CustomStack st = new CustomStack();
        for(int i = 1; i < 10; i ++) st.push(i);
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st);

        
    }
}