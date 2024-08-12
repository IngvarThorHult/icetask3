import java.util.ArrayList;

public class question22 {
    public static void main(String[] args) {
        // Create and initialize an ArrayList with some elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Print all elements of the ArrayList using their positions
        printElementsByPosition(fruits);
    }

    // Method to print all elements of the ArrayList using their positions
    private static void printElementsByPosition(ArrayList<String> list) {
        // Iterate through the ArrayList using a for loop with index
        for (int i = 0; i < list.size(); i++) {
            // Print the index and the corresponding element
            System.out.println("Position " + i + ": " + list.get(i));
        }
    }
}
