import java.util.ArrayList;
import java.util.Iterator;

public class question2 {
    public static void main(String[] args) {
        // Create an ArrayList with some elements
        ArrayList<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        items.add("Date");
        items.add("Elderberry");

        // 1. Using for-each loop
        System.out.println("Using for-each loop:");
        for (String item : items) {
            System.out.println(item);
        }

        // 2. Using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = items.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 3. Using traditional for loop with index
        System.out.println("\nUsing traditional for loop:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
    }
}
