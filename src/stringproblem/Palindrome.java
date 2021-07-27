package stringproblem;

public class Palindrome {

    public static void main(String[] args) {
        String X = "acdca".trim();

       // if (isPalindrome(X)) {
        if (isPalindromeRecursion(X, 0,X.length()-1)) {
            System.out.print("palindrome");
        } else {
            System.out.print("Not an palindrome");
        }
    }

    private static boolean isPalindrome(String x) {
        if (x == null || x.length() == 0) {
            return false;
        }
        for (int i = 0, j = x.length() - 1; i < j; i++, j--) {
            if (x.charAt(i) != x.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindromeRecursion(String x, int low, int high) {
        if (x == null || x.length() == 0) {
            return false;
        }
        if(low>=high){ //best case where are done
            return true;
        }

            if (x.charAt(low) != x.charAt(high)) {
                return false;
            }


        return isPalindromeRecursion(x,low+1, high-1);
    }
}
