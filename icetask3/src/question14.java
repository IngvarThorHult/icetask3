import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class question14 {
    public static void main(String[] args) {
        // Create and initialize an ArrayList with some elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Print the ArrayList before swapping
        System.out.println("ArrayList before swapping:");
        printArrayList(fruits);

        // Get the indices to swap from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the first element to swap: ");
        int index1 = scanner.nextInt();
        System.out.print("Enter the index of the second element to swap: ");
        int index2 = scanner.nextInt();

        // Validate indices
        if (index1 >= 0 && index1 < fruits.size() && index2 >= 0 && index2 < fruits.size()) {
            // Swap the elements
            Collections.swap(fruits, index1, index2);

            // Print the ArrayList after swapping
            System.out.println("\nArrayList after swapping:");
            printArrayList(fruits);
        } else {
            System.out.println("Invalid indices provided.");
        }
    }

    // Method to print the contents of an ArrayList
    private static void printArrayList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index " + i + ": " + list.get(i));
        }
    }
}
