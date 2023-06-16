public class posible_pairs_of_array {
    public static void pairs(int array[]){
        for (int i = 0; i < array.length; i++) {
            
            for (int j = 0; j < array.length; j++) {
                
                if(array[i]==array[j]){
                    continue;
                }
                if(i<j){
                System.out.print("("+ array[i] + "," + array[j] +")");         
                } 
            }
            System.out.println();
       
        }
    }

    public static void pairs_(int array[]){
        for (int i = 0; i < array.length; i++) {
            int curr = array[i];

            for (int j = i+1; j < array.length; j++) {
                System.out.print("("+curr+","+array[j]+")");
            }
            System.out.println();
        }
    }





    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        // pairs(num);
        //
        pairs_(num);
    }
}
