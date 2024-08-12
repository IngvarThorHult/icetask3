import java.util.ArrayList;

public class question19 {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> fruits = new ArrayList<>(20); // Initial capacity of 20
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Print the size and capacity of the ArrayList before trimming
        System.out.println("Before trimming:");
        printArrayListStatus(fruits);

        // Trim the capacity of the ArrayList to its current size
        fruits.trimToSize();

        // Print the size and capacity of the ArrayList after trimming
        System.out.println("\nAfter trimming:");
        printArrayListStatus(fruits);
    }

    // Method to print the size and capacity of the ArrayList
    private static void printArrayListStatus(ArrayList<String> list) {
        System.out.println("Size: " + list.size());
        System.out.println("Capacity: " + getArrayListCapacity(list)); // Custom method to get the capacity

        // Print the contents of the ArrayList
        System.out.println("Contents:");
        for (String item : list) {
            System.out.println(item);
        }
    }

    // Custom method to get the capacity of an ArrayList using reflection
    private static int getArrayListCapacity(ArrayList<String> list) {
        try {
            // Access the private field 'elementData' using reflection
            java.lang.reflect.Field field = ArrayList.class.getDeclaredField("elementData");
            field.setAccessible(true);
            Object[] elementData = (Object[]) field.get(list);
            return elementData.length;
        } catch (Exception e) {
            e.printStackTrace();
            return -1; // Return -1 if an error occurs
        }
    }
}
