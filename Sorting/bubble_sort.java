package Sorting;

public class bubble_sort {

    public static void bubble(int arr[]){
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        // bubble sort
        int arr[]= {2,5,3,4,1,6};
        bubble(arr);
        print(arr);
     }
}
