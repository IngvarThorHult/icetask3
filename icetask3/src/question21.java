import java.util.ArrayList;

public class question21 {
    public static void main(String[] args) {
        // Create and initialize an ArrayList with some elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Print the ArrayList before replacement
        System.out.println("ArrayList before replacement:");
        printArrayList(fruits);

        // Specify the new element to replace the second element
        String newElement = "Blueberry";

        // Replace the second element (index 1) with the new element
        replaceSecondElement(fruits, newElement);

        // Print the ArrayList after replacement
        System.out.println("\nArrayList after replacing the second element:");
        printArrayList(fruits);
    }

    // Method to replace the second element of the ArrayList
    private static void replaceSecondElement(ArrayList<String> list, String newElement) {
        if (list.size() > 1) { // Check if the list has at least two elements
            list.set(1, newElement); // Replace the element at index 1
        } else {
            System.out.println("The ArrayList does not have a second element.");
        }
    }

    // Method to print the contents of the ArrayList
    private static void printArrayList(ArrayList<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }
}

