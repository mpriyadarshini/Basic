import java.util.*;

public class Leap {

    public static boolean leap(int y){
        if((y%4==0 && y%100!=0) || y%400==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        boolean result = leap(year);
        System.out.println(result);

    }
}