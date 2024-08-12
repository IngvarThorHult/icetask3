import java.util.ArrayList;

public class question3 {
    public static void main(String[] args) {
        // Create an ArrayList and add some initial elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Print the original ArrayList
        System.out.println("Original ArrayList:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Insert an element at the first position
        colors.add(0, "Yellow");

        // Print the ArrayList after insertion
        System.out.println("\nArrayList after inserting 'Yellow' at the first position:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
