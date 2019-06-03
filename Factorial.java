import java.util.*;

public class Factorial{

    public static int factorial(int n){
        if(n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int result = factorial(number);
        System.out.println(result);
    }
}