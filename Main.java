import java.util.*;
public class Main {

    public static void main(String[] args) {
        
    }

    public static int anybaseToDecimal(int num, int base) {
        int ans = 0, basepower = 1;

        while(num > 0) {
            int rem = num % 10;
            num = num / 10;

            ans += rem * basepower;
            basepower *= base;
        }

        return ans;
    }


    public static int decimalToAnybase(int num, int base) {
        int ans = 0, tenpower = 1;

        while(num > 0) {
            int rem = num % base;
            num = num / base;

            ans += rem * tenpower;
            tenpower *= 10;
        }

        return ans;
    }

    public static int anybaseToAnybase(int num, int fromBase, int toBase) {
        int decimalForm = (anybaseToDecimal(num, fromBase));
        int convertedBaseForm = decimalToAnybase(decimalForm, toBase);
        return convertedBaseForm;
    }

    public static int addAnybase(int n, int m, int base) {
        int ans = 0, p = 1, c = 0;
        while(n > 0 || m > 0 || c > 0) {
            int d1 = n % 10, d2 = m % 10;
            n /= 10;
            m /= 10;

            int sum = d1 + d2 + c;
            int d = sum % base;
            c = sum / base;

            ans += d * p;
            p *= 10;
        }
        return ans;
    }

}