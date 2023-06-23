public class binary_search_array {
    public static int binarysearch(int array[], int key) {
        int start = 0, end = array.length - 1;

        // here we take start as strt poin and end as end point/
        // key=14
        // { 2 , 4 , 6 , 8 , 10 , 12 , 14 }
        // start-----------------------end
        while (start <= end) {
            int mid = (start + end) / 2; // (0+6)/2 = 3
            if (array[mid] == key) {
                return mid;
            }
            if (array[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 14; // key we have to find a index...

        System.out.println("index of the key : " + binarysearch(array, key));

    }
}
