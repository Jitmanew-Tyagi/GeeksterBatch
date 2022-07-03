import java.util.*;

public class FirstFile {
    public static void main(String[] args) {
        List<Integer> arl = new ArrayList<>();
        for(int i = 1; i <= 3; i ++) {
            arl.add(i);
        }
        System.out.println(arl);
        System.out.println(arl.size());
        System.out.println(arl.get(3));
        System.out.println(arl.set(0, 5)); // (index, value)
        System.out.println(arl);
        
    }
}

