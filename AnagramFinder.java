import java.util.*;

public class AnagramFinder {
    public static void main(String[] args) {
        String text = "cbaebabacd";
        String pattern = "abc";

        List<Integer> indices = findAnagrams(text, pattern);

        System.out.println("Anagram indices: " + indices);
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pCount, sCount)) result.add(0);

        for (int i = p.length(); i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++; // add new char
            sCount[s.charAt(i - p.length()) - 'a']--; // remove old char

            if (Arrays.equals(pCount, sCount)) result.add(i - p.length() + 1);
        }

        return result;
    }
}
