import java.util.ArrayList;

public class question15 {
    public static void main(String[] args) {
        // Create the first ArrayList and add some elements
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        // Create the second ArrayList and add some elements
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Date");
        list2.add("Elderberry");
        list2.add("Fig");

        // Print the original ArrayLists
        System.out.println("First ArrayList:");
        for (String item : list1) {
            System.out.println(item);
        }

        System.out.println("\nSecond ArrayList:");
        for (String item : list2) {
            System.out.println(item);
        }

        // Join the second ArrayList to the first ArrayList
        list1.addAll(list2);

        // Print the joined ArrayList
        System.out.println("\nJoined ArrayList:");
        for (String item : list1) {
            System.out.println(item);
        }
    }
}
