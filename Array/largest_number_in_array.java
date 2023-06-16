public class largest_number_in_array {

    public static int largestinarray(int num[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int num[] = {12,34,35,68,74};

        int largestnum = largestinarray(num);

        System.out.println("largest number is " + largestnum);

        
        
    }
}
