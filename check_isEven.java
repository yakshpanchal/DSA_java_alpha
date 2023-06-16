public class check_isEven {
        // Write a method named isEven that accepts an int argument.
    // The method should return true if the argument is even, or false otherwise.
    // Also write a program to test your method.
    public static void isEven(int num){
        boolean check;
        if(num%2==0){
            check = true;
        }
        else{
            check = false;
        }
        System.out.println("the number = " + num + " = " + check);
        
    }
    public static void main(String[] args) {
        
        // this is the function call to find the number is even if yes the return true ... ortherwise false .. 
        isEven(14);
        isEven(15);
    }
}
