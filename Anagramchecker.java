public import java.util.*;

public class AnagramChecker {
    // Cleans input string: lowercase, remove non-letter characters
    public static String clean(String str) {
        return str.toLowerCase().replaceAll("[^a-z]", "");
    }

    // Returns true if two cleaned strings are anagrams
    public static boolean areAnagrams(String s1, String s2) {
        s1 = clean(s1);
        s2 = clean(s2);

        if (s1.length() != s2.length()) return false;

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }
    }
}
 
