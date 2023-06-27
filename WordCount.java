import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\krarv\\Downloads\\demo\\java102\\src\\input.txt";
        String wordToCount = "Java";
        int totalCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split the line into individual words
                for (String word : words) {
                    if (word.equalsIgnoreCase(wordToCount)) {
                        totalCount++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Total occurrences of the word '" + wordToCount + "': " + totalCount);
    }
}
