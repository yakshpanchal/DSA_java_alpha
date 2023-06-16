// using (Brute_fource_method.. )

// its time complexity is  = O(n^3) // 3 netsed for loop s run in the code.. 
 public class Max_subarrays_sum_using_bruteforce {
    public static void subarray(int array[]){
        int maxsum = 0;
        
        for (int i = 0; i < array.length ; i++) {
            
            for (int j = i; j < array.length ; j++) {
                System.out.print("[");
                
                int sum= 0 ;
                
                for (int k = i; k <= j ; k++) {
                    
                    System.out.print( " " + array[k] + " ");
                    sum = sum+array[k];
                }
                System.out.print("]=");
                System.out.print(sum + "       "); 
                if(maxsum<sum){
                    maxsum = sum;
                }

            }
            
            System.out.println();

             
        }

        System.out.println( " here maximum sum of sub array is " + maxsum);
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        subarray(num);
    }
}
/*

[ 2 ]   [ 2  4 ]   [ 2  4  6 ]   [ 2  4  6  8 ]   [ 2  4  6  8  10 ]   
[ 4 ]   [ 4  6 ]   [ 4  6  8 ]   [ 4  6  8  10 ]   
[ 6 ]   [ 6  8 ]   [ 6  8  10 ]   
[ 8 ]   [ 8  10 ]   
[ 10 ] 

 */