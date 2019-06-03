import java.util.*;

public class Armstrong {

    public static void CheckArmstrong(int n) {
        int temp;
        int sum = 0;
        int number = n;
        while (n != 0) {
            temp = n % 10;
            sum = sum + temp * temp * temp;
            n = n / 10;

        }
        if (number == sum) {
            System.out.println("armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        CheckArmstrong(num);

    }
}