import java.util.*;

public class Client {
    public static void main(String[] args) {
        CustomQueue que = new CustomQueue();
        for(int i = 1; i < 10; i ++) que.add(i);
        System.out.println(que);
        System.out.println(que.remove());
        System.out.println(que.remove());
        System.out.println(que);
        System.out.println(que.peek());
        System.out.println(que);
        System.out.println(que.isEmpty());
        while(!que.isEmpty()) que.remove();
        System.out.println(que.isEmpty());
        
    }
}