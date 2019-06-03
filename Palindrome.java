import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp = n;
        int rem,sum=0;
        while (n != 0) {
            rem = n % 10;
            sum = sum*10+rem;
            n = n / 10;

        }
        if(temp==sum){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}