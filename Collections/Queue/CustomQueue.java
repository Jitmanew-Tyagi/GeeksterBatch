import java.util.*;
public class CustomQueue {
    int[] arr;
    int nel;
    CustomQueue(){
        arr = new int[10];
        nel = 0;
    }

    public int size() {
        return nel; //time -> O(1), space -> O(1)
    }

    public void add(int ele) {
        if(this.size() == 10) {
            System.out.println("Queue overflow");
            return;
        }
        arr[nel ++] = ele; //time -> O(1), space -> O(1)
    }

    public int remove() {
        if(this.size() == 0) {
            System.out.println("Queue underflow");
            return -1;
        }
        for(int i = 0; i < nel - 1; i ++) {
            swap(i, i + 1);
        }
        return arr[-- nel]; // time -> O(n), space -> O(1)
    }

    public int peek() {
        if(this.size() == 0) {
            System.out.println("Queue underflow");
            return -1;
        }
        return arr[0]; //time -> O(1), spaceO(1)
    }

    public boolean isEmpty() {
        return (nel == 0); //time -> O(1), spaceO(1)
    }

    private void swap(int f, int s) {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
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
        return sb.toString(); //time -> O(n), space -> O(n)
    }
    
}