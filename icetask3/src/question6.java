import java.util.ArrayList;

public class question6 {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
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

        // Remove the third element (index 2)
        if (fruits.size() > 2) { // Ensure there are at least 3 elements
            fruits.remove(2); // Remove element at index 2
            System.out.println("\nThird element removed.");
        } else {
            System.out.println("\nThe ArrayList does not have enough elements to remove the third one.");
        }

        // Print the updated ArrayList
        System.out.println("\nUpdated ArrayList:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(i + ": " + fruits.get(i));
        }
    }
}

