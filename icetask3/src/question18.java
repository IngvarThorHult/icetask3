import java.util.ArrayList;

public class question18 {
    public static void main(String[] args) {
        // Create and initialize an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Check if the ArrayList is empty
        System.out.println("Initial ArrayList:");
        checkAndPrintListStatus(list);

        // Add some elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Check if the ArrayList is empty after adding elements
        System.out.println("\nArrayList after adding elements:");
        checkAndPrintListStatus(list);

        // Remove all elements to make it empty again
        list.clear();

        // Check if the ArrayList is empty after clearing it
        System.out.println("\nArrayList after clearing:");
        checkAndPrintListStatus(list);
    }

    // Method to check and print whether the ArrayList is empty
    private static void checkAndPrintListStatus(ArrayList<String> list) {
        if (list.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty. Contents:");
            for (String item : list) {
                System.out.println(item);
            }
        }
    }
}

