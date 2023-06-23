public class merge_sort {

    // first function to print the array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergesort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        // work
        int mid = (si + ei) / 2; // first find the mid
        // now for left part
        mergesort(arr, si, mid);
        // now for right part
        mergesort(arr, mid + 1, ei);
        // now at this point we are saprate the array as single emenet
        // now we have to merge it in the sorted form
        merge(arr, si, mid, ei); // merge function
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1]; // this is size of temporory array
        int i = si; // index for left part
        int j = mid + 1; // index for right part
        int k = 0; // index for temp
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // now we have to copy temp arry to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        System.out.println("this is merge sort");
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        printArr(arr);
        mergesort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
