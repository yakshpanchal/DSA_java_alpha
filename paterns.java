
public class paterns {

    /*
     * pattern_1
     *
     * *
     * * *
     * * * *
     * print the pattern in java
     */
    public static void pattern_1(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // pattern_2
    /*
     * * * * *
     * *
     * *
     * * * * *
     * print that pattern in java
     * take hight and width from user and draw this ....
     * 
     */

    public static void pattern_2(int w, int h) {
        for (int i = 1; i <= h - 1; i++) {
            if (i == 1) {
                for (int j = 1; j <= w; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            else {
                System.out.print("* ");
                for (int j = 1; j < w - 1; j++) {
                    System.out.print("  ");
                }
                System.out.print("*");
                System.out.println();
            }

            if (i == h - 1) {
                for (int j = 1; j <= w; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    /*
     * // print this type of pattern ... using java
     *
     **
     ***
     ****
     *****
     */
    public static void pattern_3(int num) {
        // INVERTED & ROTATED HALF-PYRAMID pattern

        for (int i = 1; i <= num; i++) {
            for (int j = num - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // print this
    /*
     * 
     * a
     * bc
     * def
     * ghij
     * klmno
     * 
     */
    public static void pattern_4(char c, int num) {
        for (int line = 1; line <= num; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }

    /*
     * 1
     * 2 3
     * 4 5 6
     * 7 8 9 10
     * 11 12 13 14
     */
    public static void floyd(int num) {
        int counter = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void triangle(int num) {

    }

    public static void main(String[] args) {

        // pattern_1(5);

        // System.out.println();
        // pattern_2(100, 15);

        // System.out.println();
        // pattern_3(6);

        // System.out.println();
        pattern_4('a', 5);

        // floyd(15);

    }
}
