import java.util.ArrayList;

public class question13 {
    public static void main(String[] args) {
        // Create and initialize two ArrayLists with some elements
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Cherry");

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Date");
        list3.add("Elderberry");
        list3.add("Fig");

        // Compare the two ArrayLists
        System.out.println("Comparing list1 and list2:");
        compareArrayLists(list1, list2);

        System.out.println("\nComparing list1 and list3:");
        compareArrayLists(list1, list3);
    }

    // Method to compare two ArrayLists and print the result
    private static void compareArrayLists(ArrayList<String> list1, ArrayList<String> list2) {
        if (list1.equals(list2)) {
            System.out.println("The two ArrayLists are equal.");
        } else {
            System.out.println("The two ArrayLists are not equal.");
        }
    }
}
