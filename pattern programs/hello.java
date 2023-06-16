import java.util.*;

public class hello {
       /*
        * pattern 1 :
        *
        * 
        * *
        * * *
        * * * *
        * * * * *
        * 
        */
       public static void pattern_1(int line) {
              for (int i = 1; i <= line; i++) {
                     for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                     }
                     System.out.println();
              }
       }

       /*
        * patter 2 :
        * 
        * 1
        * 12
        * 123
        * 1234
        * 
        */
       public static void pattern_2(int n) {
              for (int line = 1; line <= n; line++) {
                     for (int j = 1; j <= line; j++) {
                            System.out.print(j);
                     }
                     System.out.println();
              }

       }

       /*
        * A
        * BC
        * DEF
        * HIJK
        */
       public static void char_pattern(int n) {
              char ch = 'A';
              for (int i = 1; i <= n; i++) {
                     for (int j = 1; j <= i; j++) {
                            System.out.print(ch);
                            ch++;
                     }
                     System.out.println();
              }
       }

       // hollow rectangle
       public static void hollow_rectangle(int row, int col) {
              for (int i = 1; i <= row; i++) {
                     for (int j = 1; j <= col; j++) {
                            if (i == 1 || i == row || j == 1 || j == col) {
                                   System.out.print("*");
                            } else {
                                   System.out.print(" ");
                            }
                     }
                     System.out.println();

              }
       }

       // pattern - 3
       /*
           *
          **
         ***
        **** 
       *****   
       
        */
       public static void patter_3(int n) {
              for (int i = 1; i <= n; i++) {
                     for (int j = 1; j <= n - i; j++) {
                            System.out.print(" ");
                     }
                     for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                     }
                     System.out.println();
              }
       }

       // pattern - 4

       /*
        * 
        * 1
        * 2 3
        * 4 5 6
        * 7 8 9 10
        * 11 12 13 14 15
        * 
        */
       public static void patter_4(int n) {
              int counter = 1;
              for (int i = 1; i <= n; i++) {
                     for (int j = 1; j <= i; j++) {
                            System.out.print(counter + " ");
                            counter++;
                     }
                     System.out.println();
              }
       }

       // pattern _ 5 // 0-1 triangle
       public static void triangle_0_1(int n) {
              for (int i = 1; i <= n; i++) {
                     for (int j = 1; j <= i; j++) {
                            if ((i + j) % 2 == 0) {
                                   System.out.print("1 ");
                            } else {
                                   System.out.print("0 ");
                            }
                     }
                     System.out.println();
              }
       }

       // butterfly_pattern
       public static void butterfly(int n) {

              for (int i = 1; i <= n; i++) {
                     for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                     }
                     for (int j = 1; j <= 2 * (n - i); j++) {
                            System.out.print(" ");
                     }
                     for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                     }
                     System.out.println();
              }

              for (int i = n; i >= 1; i--) {
                     for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                     }
                     for (int j = 1; j <= 2 * (n - i); j++) {
                            System.out.print(" ");
                     }
                     for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                     }
                     System.out.println();
              }
       }

       // solid rhombus
       public static void solid_rhombus(int n) {
              for (int i = 1; i <= n; i++) {
                     for (int j = 1; j <= n - i; j++) {
                            System.out.print(" ");
                     }
                     for (int j = 1; j <= n; j++) {
                            System.out.print("*");
                     }
                     System.out.println();
              }
       }

       // dimond pattern
       public static void dimond(int n) {
              for (int i = 1; i <= n; i++) {
                     for (int j = 1; j <= n - i; j++) {
                            System.out.print(" ");
                     }
                     for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                     }
                     System.out.println();
              }
              for (int i = n; i >= 1; i--) {
                     for (int j = 1; j <= n - i; j++) {
                            System.out.print(" ");
                     }
                     for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                     }
                     System.out.println();
              }
       }

       public static void main(String[] args) {
              pattern_1(5);
              // pattern_2(5);
              // char_pattern(5);
              // hollow_rectangle(4, 5);
              // patter_3(4);
              // patter_4(5);
              // triangle_0_1(7);
              // butterfly(8);
              // solid_rhombus(10);
              // dimond(10);
       }

}