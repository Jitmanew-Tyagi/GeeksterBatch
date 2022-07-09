import java.util.*;
public class LargetAreaHistogram {
    public static void main(String[] args) {
        System.out.println(calcMaxArea(new int[]{2, 1, 5, 6, 2, 3}));
    }

    public static int[] nextSmallerLeft(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for(int i = 0; i < n; i ++) {
            if(st.isEmpty()) ans[i] = -1;
            else if(arr[st.peek()] < arr[i]) ans[i] = st.peek();
            else {
                while(st.size() > 0 && arr[st.peek()] >  arr[i]) st.pop();
                if(st.isEmpty()) ans[i] = -1;
                else ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    public static int[] nextSmallerRight(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for(int i = n - 1; i >= 0; i --) {
            if(st.isEmpty()) ans[i] = n;
            else if(arr[st.peek()] < arr[i]) ans[i] = st.peek();
            else {
                while(st.size() > 0 && arr[st.peek()] >  arr[i]) st.pop();
                if(st.isEmpty()) ans[i] = n;
                else ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    public static int calcMaxArea(int[] arr) {
        int[] left = nextSmallerLeft(arr);
        int[] right = nextSmallerRight(arr);
        display(left);
        display(right);
        int n = arr.length, maxArea = 0;
        for(int i = 0; i < n; i ++) {
            int width = right[i] - left[i] - 1;
            int area = width * arr[i];
            if (area > maxArea) maxArea = area;
        }
        return maxArea;
    }
    public static void display(int[] arr) {
        for(int i : arr) System.out.print(i + " ");
        System.out.println();
    }
}