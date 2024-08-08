package String;

import java.util.Arrays;

public class SortNames {
    public static void main(String[] args) {
        // Array of names
        String[] friends = {
            "Alice",
            "Bob",
            "Charlie",
            "David",
            "Eve",
            "Frank",
            "Grace",
            "Hannah",
            "Isaac",
            "Jack"
        };

        // Sort the array using Arrays.sort() method
        Arrays.sort(friends);

        // Print the sorted names
        System.out.println("Sorted names:");
        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}
