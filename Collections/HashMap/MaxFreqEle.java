import java.util.*;

public class MaxFreqEle {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,3,3,3,3,3,3,5,5,5,5,5,5,5,5,5,7,7,7,7,7,7,7,9,9,9,6,6,6,6,2,5,2};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : arr) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
            // if(hm.containsKey(i)) { //prev occ are there
            //     hm.put(i, (hm.get(i) + 1));
            //     int oldFreq = hm.get(i);
            //     int newFreq = oldFreq + 1;
            //     hm.put(i, newFreq);
            // } else {
            //     hm.put(i, 1);
            // }
        }

        int maxKey = -1, maxFreq = -1;
        for(int i : hm.keySet()) {
            if(hm.get(i) > maxFreq) { // hm.get(i) -> freq of i
                maxKey = i;
                maxFreq = hm.get(i);
            }
        }
        System.out.println(maxKey);
        System.out.println(hm);
    }
}