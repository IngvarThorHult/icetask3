import java.util.ArrayList;

public class question17 {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Print the ArrayList before clearing
        System.out.println("ArrayList before clearing:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Empty the ArrayList
        fruits.clear();

        // Print the ArrayList after clearing
        System.out.println("\nArrayList after clearing:");
        if (fruits.isEmpty()) {
            System.out.println("The ArrayList is now empty.");
        } else {
            for (String fruit : fruits) {
                System.out.println(fruit);
            }
        }
    }
}
