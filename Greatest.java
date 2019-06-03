import java.util.*;

public class Greatest {

    public static int greatest(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c && b > a) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a1 = s.nextInt();
        int a2 = s.nextInt();
        int a3 = s.nextInt();
        int result = greatest(a1, a2, a3);
        System.out.println(result);
    }
}