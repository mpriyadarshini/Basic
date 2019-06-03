import java.util.*;

public class Prime {

    public static boolean prime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int n) {

        for (int i = 2; i <= n; i++) {
            if (prime(i)) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        printPrime(a);
    }
}