import java.util.*;
public class BuyTickets {
    public static void main(String[] args) {
        int[] prices = {2, 1, 5, 6, 2, 3};
        int[] span = new int[prices.length];
        int[] ngl = nextGreaterToTheLeft(prices);
        for(int i = 0; i < span.length; i ++) {
            span[i] = i - ngl[i];
        }
        for(int i : span) {
            System.out.print(i + " ");
        }
    }

   
}