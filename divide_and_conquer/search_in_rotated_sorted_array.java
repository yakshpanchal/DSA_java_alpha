public class search_in_rotated_sorted_array {

    public static int search(int arr[], int tar, int si, int ei) {

        // base case :
        if (si > ei) {
            return -1;
        }

        // work
        // first we find a mid
        int mid = (si + ei) / 2;

        // case that if arr[mid] == tar
        if (arr[mid] == tar) {
            return mid;
        }

        // case 1: mid on line1
        if (arr[si] <= arr[mid]) {
            // left of mid
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            }
            // righ of mid
            else {
                return search(arr, tar, mid + 1, ei);
            }
        }

        // case 2: mid on line2
        else {
            // right of mid
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            }
            // left of mid
            else {
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };

        int target = 0; // output = 4
        int tarInd = search(arr, target, 0, arr.length - 1);
        System.out.print(tarInd);

    }
}
