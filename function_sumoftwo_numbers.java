import java.util.*;

public class function_sumoftwo_numbers {
    public static void sumoftwonum(int num1,int num2){

        int sum = num1 + num2 ;
        System.out.println("the sum : " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sumoftwonum(a,b);
    }
}
