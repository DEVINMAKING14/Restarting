import java.util.*;

public class SortByLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine().toLowerCase().replaceAll("[^a-z\\s]", "");
        String[] words = sentence.split("\\s+");

        Arrays.sort(words, Comparator.comparingInt(String::length));

        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
