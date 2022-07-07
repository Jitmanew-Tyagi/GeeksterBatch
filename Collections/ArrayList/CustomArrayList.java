import java.util.*;

public class CustomArrayList {
    private int nel = 0;
    private int[] arr = new int[10]; // ps == 10;

    public int size() {
        System.out.println("Specially for Ankur sir, pseudo size:" + arr.length);
        return nel;
    }

    public void add (int ele) {
        if(nel == arr.length) 
            expand(); // array - > double
        arr[nel] = ele;
        nel ++;
    }

    private void expand() {
        // make an array of double size
        // copy elements of arr to that new array
        // arr -> newarray
        int[] newarr = new int[2 * arr.length];
        for(int i = 0; i < arr.length; i ++) {
            newarr[i] = arr[i];
        } 
        arr = newarr;
    }

    public void update(int idx, int ele) {
        if(idx >= nel || idx < 0) {
            System.out.println("Invalid index");
        }
        else {
            arr[idx] = ele;
        }
    }
    
    public int get(int idx) {
        if(idx >= nel || idx < 0) {
            System.out.println("Invalid index");
            return -1;
        } else {
            return arr[idx];
        }
    }
    
    public void remove(int idx) {
        if(idx >= nel || idx < 0) {
            System.out.println("Invalid index");
            return;
        }
        for(int i = idx; i < nel - 1; i ++) {
            swap(i);
        }
        nel --;
    }

    private void swap(int idx) {
        int temp = arr[idx];
        arr[idx] = arr[idx + 1];
        arr[idx + 1] = temp;
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
        return "Ankur sir, be on time";
    }
}