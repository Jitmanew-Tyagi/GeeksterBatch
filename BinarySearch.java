import java.util.*;
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 8, 9, 12}; // 2
        // System.out.println(simpleBinarySearch(arr, 11)); // 1
        // System.out.println(firstOcc(arr, 1)); // 1
        // System.out.println(lastOcc(arr, 1)); // 1
        System.out.println(findFloor(arr, 6)); // 1

    }

    public static int simpleBinarySearch(int[] arr, int ele) {
        int s = 0, e = arr.length - 1;

        while(s <= e) {
            int mid = (s + e) / 2;
            if(arr[mid] == ele) return mid;
            else if(arr[mid] < ele) s = mid + 1;
            else e = mid - 1;
        }
        return -1;

    } 

    public static int firstOcc(int[] arr, int ele) {
        int s = 0, e = arr.length - 1, ans = -1;

        while(s <= e) {
            int mid = (s + e) / 2;
            if(arr[mid] == ele) {
                ans = mid;
                e = mid - 1;
            } else if(arr[mid] < ele) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public static int lastOcc(int[] arr, int ele) {
        int s = 0, e = arr.length - 1, ans = -1;

        while(s <= e) {
            int mid = (s + e) / 2;
            if(arr[mid] == ele) {
                ans = mid;
                s = mid + 1;
            } else if(arr[mid] < ele) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    //leetcode 34
    public int firstAndLastOcc(int[] arr, int ele, boolean lo) {
        int s = 0, e = arr.length - 1, ans = -1;
        while(s <= e) {
            int mid = (s + e) / 2;
            if(arr[mid] == ele) {
                ans = mid;
                if(lo == false) e = mid - 1;
                else s = mid + 1;
            } else if(arr[mid] < ele) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    } // DRY Dont repeat yourself
// leetcode dicussion

    public static int findFloor(int[] arr, int ele) {
        int s = 0, e = arr.length - 1, floor = -1;
        while(s <= e) {
            int mid = s + (e - s) / 2;
            if(arr[mid] == ele) return mid;
            else if(arr[mid] < ele) {
                floor = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return floor; 
    }

}