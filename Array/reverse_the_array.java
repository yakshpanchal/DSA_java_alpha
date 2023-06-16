public class reverse_the_array {
    
    public static void reverse(int array[]){
        int first = 0;
        int last = array.length-1;
        while (first<last) {
            
            int temp = array[last];
            array[last] = array[first];
            array[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        System.out.println("before calling function");
        for(int i=0 ; i< num.length ; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();

        reverse(num);
        System.out.println("after calling function");

        for(int i=0 ; i< num.length ; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}
