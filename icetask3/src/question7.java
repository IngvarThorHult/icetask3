import java.util.ArrayList;
import java.util.Scanner;

public class question7 {
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

        // Get the element to search from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search for: ");
        String elementToSearch = scanner.nextLine();

        // Search for the element and print the result
        searchElement(fruits, elementToSearch);
    }

    // Method to search for an element in the ArrayList
    private static void searchElement(ArrayList<String> list, String element) {
        // Check if the list contains the element
        if (list.contains(element)) {
            // Get the index of the element
            int index = list.indexOf(element);
            System.out.println("Element '" + element + "' found at index: " + index);
        } else {
            System.out.println("Element '" + element + "' not found in the ArrayList.");
        }
    }

    // Method to print the contents of the ArrayList
    private static void printArrayList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index " + i + ": " + list.get(i));
        }
    }
}


