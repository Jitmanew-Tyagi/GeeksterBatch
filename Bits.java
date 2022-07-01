import java.util.*;
public class Bits {

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(42));
        System.out.println(Integer.toBinaryString(deepakSirOP(42, 2)));
    }

    public static boolean isBitOn(int num, int bitNum) {
        int mask = 1;
        mask = (mask << (bitNum - 1));
        int res = num & mask;
        if(res == 0) return false;
        else return true;
    }

    public static int switchTheBitON(int num, int bitNum) {
        int mask = 1;
        mask = mask << (bitNum - 1);

        num = (num | mask);
        return num; 
    }

    public static int deepakSirOP(int num, int bitNum) {
        int mask = 1;
        mask = (mask << bitNum - 1);

        num = (num ^ mask);
        return num;
    }
}