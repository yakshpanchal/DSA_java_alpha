import javax.print.DocFlavor.STRING;

public class find_permutattion_backtraking {
    public static void findpermutation(String str, String ans) {
        // basecase
        if (str.length() == 0) {
            System.out.println(ans);
        }
        // work
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // "abcde" // for remove c in this we do like "ab"+"de" = "abde"
            String NewStr = str.substring(0, i) + str.substring(i + 1);

            findpermutation(NewStr, ans + curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        String ans = "";

    }
}
