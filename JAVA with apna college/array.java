import java.util.Scanner;

public class array {
    /// inputs and outputs into arrays .. 
    public static void input_output(){
        int marks[] = new int[3];
        Scanner sc =  new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println( "first marks :"+ marks[0]);
        System.out.println("second marks :"+marks[1]);
        System.out.println("third marks  :"+marks[2]);

    }


    public static void update(int marks[]){
        // we update that array in this function
        for(int i=0 ; i<marks.length;i++){
            marks[i]= marks[i] + 1;
        }
    } 
    public static int linear_search(int num[],int key){
        for (int i = 0; i < num.length; i++) {
            if (num[i]==key) {
                return i;
            }
        }
        return -1;
        
    } 

    public static void main(String[] args) {
        // input_output();
        int marks[] = {97,98,99};
        update(marks);    

        for(int i=0;i< marks.length ; i++){
            System.out.print(marks[i] + " ");
        }
        // they print 98 99 100 
        // they chnge in main the arrays are work on the call by refrence . . . 
        System.out.println();

        int num[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 8;
        int index = linear_search(num, key);

        if(index==-1){
            System.out.print("Not found");
        }
        else{
            System.out.print("index : " + index);
        }



    }
}
