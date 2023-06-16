import java.util.*;
public class factorial_binomial_coefficient {

    public static int factorial(int n){
        int f=1;
        for (int i = 1; i <= n; i++) {
            f= f*i;
        }
        
        return f;
    }

    public static int binomialcoff(int n,int r){
        int fac_n = factorial(n);
        int fac_r = factorial(r);
        int fac_nmr = factorial(n-r);

        int binomialcoff = fac_n / (fac_r)*(fac_nmr);
        return binomialcoff;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello to find factorial of n and bionomial coefficient of ncr enter a values...");
        System.out.println("enter n =");
        int n = sc.nextInt();
        System.out.println("enter r =");
        int r = sc.nextInt();
        System.out.println("factorial of n is : "+ factorial(n));
        System.out.println("bionomial coefficient of nCr is : "+binomialcoff(n, r));


    }
}
