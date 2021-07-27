package stringproblem;

public class RotationalPaindrome {
    public static void main(String args[]) throws Exception {
        String string = "baabcc";
        validateRotatedPalindrome(string);
    }

    private static boolean isPalindrome(final String s) {
        return s.equalsIgnoreCase(new StringBuilder().append(s)
                .reverse().toString());
    }

    private static void validateRotatedPalindrome(final String testString) {

        final StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < testString.length(); i++) {
            stringBuilder.append(testString.charAt(i));
            String subString = testString.substring(i + 1);
            String testPalindromeString = subString.concat(stringBuilder.toString());

            if (isPalindrome(testPalindromeString)) {
                System.out.println("Substring = " + testPalindromeString
                        + " is a rotated palindrome");
                return;
            }

        }
    }
}
