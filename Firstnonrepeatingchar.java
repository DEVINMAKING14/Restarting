import java.util.*;

public class FirstnonrepeatingChar {
    public static Character findFirstNonRepeating(String s) {
        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Find first character with frequency 1
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Character result = findFirstNonRepeating(input);

        if (result != null) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("None — all characters repeat.");
        }
    }
}
