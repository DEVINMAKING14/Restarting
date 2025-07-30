import java.util.*;

public class Longest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int start = 0, maxLength = 0;
        int left = 0;
        Map<Character, Integer> seen = new HashMap<>();
        int substringStart = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if (seen.containsKey(ch) && seen.get(ch) >= left) {
                left = seen.get(ch) + 1;
            }

            seen.put(ch, right);

            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                substringStart = left;
            }
        }

        String longestSubstring = s.substring(substringStart, substringStart + maxLength);

        System.out.println("Longest substring without repeating characters: " + longestSubstring);
        System.out.println("Length: " + maxLength);
    }
}
