import java.util.Scanner;

public class allcounters{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Counters
        int vowels = 0, consonants = 0, digits = 0, specialChars = 0;

        // Convert input to lowercase for easy comparison
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else if (ch != ' ') {
                specialChars++;
            }
        }

        // Output
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialChars);

        sc.close();
    }
}
