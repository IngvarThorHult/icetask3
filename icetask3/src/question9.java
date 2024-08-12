import java.util.ArrayList;

public class question9 {
    public static void main(String[] args) {
        // Create and initialize the source ArrayList with some elements
        ArrayList<String> sourceList = new ArrayList<>();
        sourceList.add("Apple");
        sourceList.add("Banana");
        sourceList.add("Cherry");
        sourceList.add("Date");
        sourceList.add("Elderberry");

        // Print the source ArrayList
        System.out.println("Source ArrayList:");
        printArrayList(sourceList);

        // Create a destination ArrayList
        ArrayList<String> destinationList = new ArrayList<>();

        // Copy all elements from sourceList to destinationList
        destinationList.addAll(sourceList);

        // Print the destination ArrayList
        System.out.println("\nDestination ArrayList after copying:");
        printArrayList(destinationList);
    }

    // Method to print the contents of an ArrayList
    private static void printArrayList(ArrayList<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }
}
