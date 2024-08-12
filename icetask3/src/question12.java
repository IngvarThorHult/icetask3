import java.util.ArrayList;
import java.util.List;

public class question12 {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        fruits.add("Fig");
        fruits.add("Grape");

        // Print the original ArrayList
        System.out.println("Original ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Define the portion to extract
        int fromIndex = 2; // inclusive
        int toIndex = 5;   // exclusive

        // Extract the portion of the ArrayList
        List<String> subList = fruits.subList(fromIndex, toIndex);

        // Print the extracted portion
        System.out.println("\nExtracted portion of the ArrayList:");
        for (String fruit : subList) {
            System.out.println(fruit);
        }
    }
}
