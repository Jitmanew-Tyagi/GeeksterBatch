import java.util.*;

public class PeakElements {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> arl = new ArrayList<>();
        int size = scn.nextInt();
        // while(size --> 0) 
        for(int i = 0; i < size; i ++) arl.add(scn.nextInt()); //input
        
        for(int i = 1; i <= arl.size() - 2; i ++) {
            if(isPeak(arl, i)) System.out.println(arl.get(i));
        }
    }

    public static boolean isPeak(ArrayList<Integer> arr, int idx) {
        if(arr.get(idx - 1) < arr.get(idx) && arr.get(idx + 1) < arr.get(idx)) 
            return true;
        return false;
    }
}