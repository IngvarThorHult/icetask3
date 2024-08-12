import java.util.ArrayList;

public class question20 {
    public static void main(String[] args) {
        // Create an ArrayList with an initial capacity
        ArrayList<String> list = new ArrayList<>(5); // Initial capacity of 5

        // Print the initial size and capacity of the ArrayList
        System.out.println("Initial ArrayList:");
        printArrayListStatus(list);

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // Print the ArrayList after adding elements
        System.out.println("\nArrayList after adding 5 elements:");
        printArrayListStatus(list);

        // Add more elements to increase the size of the ArrayList
        list.add("Fig");
        list.add("Grape");
        list.add("Honeydew");

        // Print the ArrayList after adding more elements
        System.out.println("\nArrayList after adding 8 elements:");
        printArrayListStatus(list);
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
