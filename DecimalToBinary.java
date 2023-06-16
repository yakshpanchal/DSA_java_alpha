public class DecimalToBinary {
    
    public static void DecToBin(int num){
        int pow  = 0;
        int binnum = 0;
        while (num > 0) {
            int rem  = num % 2;
            binnum = binnum + rem * (int)Math.pow(10,pow);
            pow ++;
            num = num /2;
        }
        System.out.println(binnum);
    }

    public static void main(String[] args) {
        DecToBin(100);
    }
}
