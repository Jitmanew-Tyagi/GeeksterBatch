import java.util.*;

public class MountainArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> arl = new ArrayList<>();
        int size = scn.nextInt();
        for(int i = 0; i < size; i ++) arl.add(scn.nextInt()); 
       
        if(isMountain(arl)) System.out.println("It is a mountain array");
        else System.out.println("It isn't a mountain array");
       
    }

    public static boolean isMountain(ArrayList<Integer> arr) {
       if(arr.size() < 3) return false;
       if(arr.get(0) > arr.get(1)) return false;
       int trav = 1;
       while(trav < arr.size() && arr.get(trav - 1) < arr.get(trav)) trav ++;
       if(trav == arr.size()) return false;
       while(trav < arr.size() && arr.get(trav - 1) > arr.get(trav)) trav ++;
        if(trav != arr.size()) return false;
        return true;
    }
}