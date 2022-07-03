import java.util.*;

public class Client {
    public static void main(String[] args) {
        CustomArrayList arl = new CustomArrayList();
        for(int i = 0; i < 15; i ++) {
            arl.add(i + 1);
        }

        // System.out.println(arl.size());
        System.out.println(arl);
        arl.update(12, 130);
        System.out.println(arl.get(12));
        arl.remove(10);
        System.out.println(arl);
    }
}