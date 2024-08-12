import java.util.ArrayList;
import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        // Create and initialize an ArrayList with some elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Print the ArrayList
        System.out.println("Current ArrayList:");
        printArrayList(fruits);

        // Get index from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the element to retrieve: ");
        int index = scanner.nextInt();

        // Retrieve and print the element at the specified index
        retrieveElementByIndex(fruits, index);
    }

    // Method to retrieve and print the element at a specified index
    private static void retrieveElementByIndex(ArrayList<String> list, int index) {
        try {
            // Attempt to retrieve the element at the given index
            String element = list.get(index);
            System.out.println("Element at index " + index + ": " + element);
        } catch (IndexOutOfBoundsException e) {
            // Handle the case where the index is out of bounds
            System.out.println("Index " + index + " is out of bounds. Please enter a valid index.");
        }
    }

    // Method to print the contents of the ArrayList
    private static void printArrayList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index " + i + ": " + list.get(i));
        }
    }
}
