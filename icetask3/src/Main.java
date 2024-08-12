import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to hold String elements
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Print out the contents of the ArrayList
        System.out.println("Colors in the list:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
