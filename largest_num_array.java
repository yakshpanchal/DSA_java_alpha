public class largest_num_array {
    public static int getlargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 12, 34, 21, 78, 34, 67 };
        System.out.println("largest value is " + getlargest(numbers));

    }
}
