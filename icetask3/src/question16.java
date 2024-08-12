import java.util.ArrayList;

public class question16 {
    public static void main(String[] args) {
        // Create the original ArrayList and add some elements
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Cherry");
        originalList.add("Date");
        originalList.add("Elderberry");

        // Print the original ArrayList
        System.out.println("Original ArrayList:");
        for (String fruit : originalList) {
            System.out.println(fruit);
        }

        // Clone the original ArrayList to a new ArrayList
        ArrayList<String> clonedList = new ArrayList<>(originalList);

        // Print the cloned ArrayList
        System.out.println("\nCloned ArrayList:");
        for (String fruit : clonedList) {
            System.out.println(fruit);
        }
    }
}

