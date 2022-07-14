import java.util.*;

public class Client {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // pq.add(5);      // time complexity -> add, remove -> log(n)
        // pq.add(50);      // peek -> O(1); 
        // pq.add(15);      
        // pq.add(25);      
        // pq.add(22);      
        // pq.add(21);      
        // pq.add(12);      
        // pq.add(2);      
        // pq.add(20);      
        // pq.add(19);    
        // while(!pq.isEmpty()) System.out.println(pq.remove()); // priority -> min
        int[] arr = {1, 5, 6, 7, 2, 1, 0, 3, 5};
        for(int i : arr) pq.add(i);
        int idx = 0;
        while(idx < arr.length) arr[idx ++] = pq.remove();
        for(int i : arr) System.out.print(i + " ");
        
    }
}