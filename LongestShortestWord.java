import java.util.*;

public class LongestShortestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine().toLowerCase().replaceAll("[^a-z\\s]", "");
        String[] words = sentence.split("\\s+");

        String longest = "", shortest = words[0];

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }

        System.out.println("Longest word: " + longest + " (" + longest.length() + ")");
        System.out.println("Shortest word: " + shortest + " (" + shortest.length() + ")");
    }
}
