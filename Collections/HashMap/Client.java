import java.util.*;

public class Client {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();
        hm.put("Delhi", 25000);
        hm.put("Maharashtra", 30000);
        hm.put("Haryana", 20000);
        hm.put("Kerala", 60000);
        hm.put("Maharashtra", 3000);
        System.out.println(hm.getOrDefault("Maharashtra", 0));
        System.out.println(hm.getOrDefault("Goa", 0));
        // System.out.println(hm);
        // System.out.println(hm.containsKey("Maharashtra"));
        // System.out.println(hm.containsValue(600000));
    }
}