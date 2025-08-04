import java.util.*;

public class RunLengthEncoding {
    public static String compress(String str) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to compress: ");
        String input = sc.nextLine();

        String compressed = compress(input);
        System.out.println("Compressed string: " + compressed);
    }
}
