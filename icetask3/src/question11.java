import java.util.ArrayList;
import java.util.Collections;

public class question11 {
    public static void main(String[] args) {
        // Create and initialize an ArrayList with some elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Print the ArrayList before reversing
        System.out.println("ArrayList before reversing:");
        printArrayList(fruits);

        // Reverse the ArrayList
        Collections.reverse(fruits);

        // Print the ArrayList after reversing
        System.out.println("\nArrayList after reversing:");
        printArrayList(fruits);
    }

    // Method to print the contents of an ArrayList
    private static void printArrayList(ArrayList<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }
}
