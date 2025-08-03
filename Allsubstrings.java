import java.util.*;

public class AllSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int count = 0;
        System.out.println("\nAll substrings:");
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                System.out.println(input.substring(i, j));
                count++;
            }
        }

        System.out.println("\nTotal substrings: " + count);
    }
}
