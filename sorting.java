public class sorting {
    // selecton sort
    public static void selection(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int minpos = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]) {
                    minpos = j;
                }
            }
            // swap
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }
    // bubble sort
    public static void bubble(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    //insertion sort
    public static void insertion(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;

            // while (prev >= 0 && arr[prev]>curr) {
            //     arr[prev+1] = arr[prev];
            //     prev --;
            // }

            arr[prev + 1] = curr;
        }
    }
    // print the array
    public static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {2,5,3,4,1,6};
        selection(arr);
        print(arr);
    }
}
