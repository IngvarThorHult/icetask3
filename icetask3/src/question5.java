import java.util.ArrayList;
import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        // Create an ArrayList and add some initial elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Print the original ArrayList
        System.out.println("Original ArrayList:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(i + ": " + fruits.get(i));
        }

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the index of the element to update
        System.out.print("Enter the index of the element you want to update: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Prompt the user to enter the new element
        System.out.print("Enter the new value for index " + index + ": ");
        String newValue = scanner.nextLine();

        // Update the element at the specified index
        if (index >= 0 && index < fruits.size()) {
            fruits.set(index, newValue);
            System.out.println("Element at index " + index + " has been updated to: " + newValue);
        } else {
            System.out.println("Index out of range. Please enter a valid index.");
        }

        // Print the updated ArrayList
        System.out.println("\nUpdated ArrayList:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(i + ": " + fruits.get(i));
        }

        // Close the scanner
        scanner.close();
    }
}
