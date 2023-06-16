public class subarray {

    public static void subarray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                System.out.print("[");
                for (int k = start; k < end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.print("]");
            }
        }
    }
    
    public static void Max_subarray(int arr[]){
        int max = 0 ;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0 ;
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                    sum = sum+arr[k];
                }
                System.out.print("]=");
                System.out.print(sum + " ");
                if(max < sum){
                    max = sum;
                }
            }
            System.out.println();
        }
        System.out.println("max sum "+ max);
    }

    public static void main(String[] args) {
     int arr[] = {2,4,6,8,10};
     subarray(arr);
     Max_subarray(arr);   
    }
}
