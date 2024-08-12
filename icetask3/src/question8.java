import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class question8 {
    public static void main(String[] args) {
        // Create and initialize an ArrayList with some elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Print the ArrayList before sorting
        System.out.println("ArrayList before sorting:");
        printArrayList(fruits);

        // Sort the ArrayList in natural order
        Collections.sort(fruits);

        // Print the ArrayList after sorting in natural order
        System.out.println("\nArrayList after sorting in natural order:");
        printArrayList(fruits);

        // Sort the ArrayList in reverse order
        Collections.sort(fruits, Collections.reverseOrder());

        // Print the ArrayList after sorting in reverse order
        System.out.println("\nArrayList after sorting in reverse order:");
        printArrayList(fruits);
    }

    // Method to print the contents of the ArrayList
    private static void printArrayList(ArrayList<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }
}

