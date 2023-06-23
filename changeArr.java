public class changeArr {
    public static void changeArr(int arr[], int i, int val) {
        // base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        // work
        arr[i] = val; // first we can push value in arr index vise [1,2,3,4,5]

        changeArr(arr, i + 1, val + 1); // this is innercall for recursion

        arr[i] = arr[i] - 2; // this is backtraking step here we have backtrack this is change the array
        return;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}
