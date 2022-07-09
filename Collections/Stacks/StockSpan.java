import java.util.*;
public class StockSpan {
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

   public static int[] nextGreaterToTheLeft(int[] arr) { // index
      Stack<Integer> st = new Stack<>();
      int n = arr.length, ans[] = new int[n];
      for(int i = 0; i < n; i ++) {
          while(!st.isEmpty() && arr[st.peek()] <= arr[i]) st.pop();
          ans[i] = st.isEmpty() ? -1 : st.peek();
          st.push(i);
      }
      return ans;
   }
}