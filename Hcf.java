import java.util.*;

public class Hcf {

    public static int hcf(int c, int d) {
        int temp;
        int a1 = c;
        while (d != 0) {
            temp = d;
            d = c % d;
            c= temp;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int result = hcf(a, b);
        System.out.println(result);
    }
}