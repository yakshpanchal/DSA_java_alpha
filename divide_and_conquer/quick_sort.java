public class quick_sort {

    private static void printArr(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void quicksort(int arr[], int si, int ei) {
        // basecase
        if (si >= ei) {
            return;
        }
        // work we have to define pivot
        int pIdx = partition(arr, si, ei);
        quicksort(arr, si, pIdx - 1); // left
        quicksort(arr, pIdx + 1, ei); // right
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // here i = 0-1 = -1
        for (int j = ei; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        printArr(arr);
        quicksort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
