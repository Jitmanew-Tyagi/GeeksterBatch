import java.util.*;
public class CustomStack {
    private int[] arr = new int[10];
    private int nel = 0;

    public int size() {
        return nel;
    }

    public void push(int ele) {
        if(nel == arr.length) {
            System.out.println("Stack Overflow...");
            return;
        }
        arr[nel] = ele;
        nel = nel + 1;
    }
    
    public int pop() {
        if(this.size() == 0) {
            System.out.println("Stack Underflow...");
            return -1;
        }
        int val = arr[nel - 1];
        nel = nel - 1;
        return val;
    }

    public int peek() {
        if(this.size() == 0) {
            System.out.println("Stack Underflow...");
            return -1;
        }
        return arr[nel - 1];
    }

    public boolean isEmpty() {
        return nel == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for(int i = 0; i < nel; i ++) {
            sb.append(arr[i]);
            sb.append(", ");
        }

        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        return sb.toString();
    }

}