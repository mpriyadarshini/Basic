import java.util.*;

public class StringReverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        StringBuilder sb = new StringBuilder(s1);

        if (s1.equals(sb.reverse().toString())) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}