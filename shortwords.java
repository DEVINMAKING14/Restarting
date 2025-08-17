public abstract class dd {
    import java.util.*;

public class SortWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine().toLowerCase().replaceAll("[^a-z\\s]", "");
        String[] words = sentence.split("\\s+");

        Arrays.sort(words);

        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}

}
