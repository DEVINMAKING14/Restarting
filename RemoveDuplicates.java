import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // If character is not already in result, add it
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        // Output
        System.out.println("String after removing duplicates: " + result);

        sc.close();
    }
}
