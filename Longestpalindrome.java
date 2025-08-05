import java.util.*;

public class LongestPalindrome {
    public static String longestPalindromicSubstring(String s) {
        int start = 0, maxLength = 1;

        for (int i = 0; i < s.length(); i++) {
            // Even length palindrome
            int low = i - 1;
            int high = i;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    start = low;
                    maxLength = high - low + 1;
                }
                low--;
                high++;
            }

            // Odd length palindrome
            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    start = low;
                    maxLength = high - low + 1;
                }
                low--;
                high++;
            }
        }

        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = longestPalindromicSubstring(input);
        System.out.println("Longest Palindromic Substring: " + result);
    }
}
