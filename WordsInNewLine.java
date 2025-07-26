import java.util.Scanner;

public class WordsInNewLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split words
        String[] words = sentence.trim().split("\\s+");

        // Output each word
        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }

        sc.close();
    }
}
