import java.util.*;
public class Main {
    public static void main(String[] args) {
        printIncreasing(10);
    }

    public static void printDescending(int n) {
        if(n == 0) return;
        System.out.println(n);
        printDescending(n - 1);
    }

    public static void printIncreasing(int n) {
        if(n == 0) return;
        printIncreasing(n - 1);
        System.out.println(n);
    }

    public static void preInPost(int n) {
        if(n <= 1) {
            System.out.println("Base" + n);
            return;
        }
        System.out.println("Pre" + n);
        preInPost(n - 1);
        System.out.println("In" + n);
        preInPost(n - 2);
        System.out.println("Post" + n);
    }
}