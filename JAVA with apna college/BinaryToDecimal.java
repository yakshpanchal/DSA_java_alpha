public class BinaryToDecimal {
    
    public static void bintodec(int binnum){
        int num = binnum;
        int pow = 0;
        int dec = 0;
        while(binnum > 0){
            int lastdigit = binnum % 10;
            dec = dec + (lastdigit * (int)Math.pow(2,pow));
            pow++;
            binnum = binnum/10;

        }
        System.out.println("your binary num"+  num  + " = decimal number " +  dec  );

    }
    
    public static void main(String[] args) {
        bintodec(111);
    }
}
