public class find_subset_backtracking {
    public static void findsubsets(String str, String ans, int i) {
        // baseecase
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return; // after return then they perform backtraking .
        }
        // subset having a two choice
        // yes if str.charAt(i) we consider then add to ans and increment i+1 for next
        findsubsets(str, ans + str.charAt(i), i + 1); //
        // NO if str.charAt(i) we do not consider then ans remain same and increment i+1
        // for next
        findsubsets(str, ans, i + 1); //

    }

    public static void main(String[] args) {
        String str = "abc"; // string
        findsubsets(str, "", 0); // function call

    }
}
