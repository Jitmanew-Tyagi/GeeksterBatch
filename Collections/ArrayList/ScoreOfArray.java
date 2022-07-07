import java.util.*;

public class ScoreOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // ArrayList<Integer> arl = new ArrayList<>();
        // int size = scn.nextInt();
        // while(size --> 0) 
        // for(int i = 0; i < size; i ++) arl.add(scn.nextInt());
        // System.out.println(score(arl));
        whileExp();
    }

    public static int score(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int i : arr) {
            if(i > max) max = i;
            if(i < min) min = i;
        }
        return max - min;
    }

    public static void whileExp() {
        int size = 6;
        while(size --> 0) System.out.print(size + " ");
    //    [1 2 1 4 2 5 3]
    }

}