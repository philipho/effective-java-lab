package item06_dont_create_unnecessary_objects;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GoodExample {
    public static void main(String[] args) {
        Map<String, String> my = new HashMap<>();
        my.put("1", "A");
        my.put("2", "B");

        Set<String> keySet1 = my.keySet();
        Set<String> keySet2 = my.keySet();
        Set<String> copy = new HashSet<>(keySet1);

        if (keySet1 == keySet2) {
            System.out.println("keySet1 and keySet2 are the same object.");
        } else {
            System.out.println("keySet1 and keySet2 are two different objects");
        }

        if (keySet1 == copy) {
            System.out.println("keySet1 and copy are the same object.");
        } else {
            System.out.println("keySet1 and copy are two different objects");
        }

        if (keySet1.equals(copy)) {
            System.out.println("keySet1 contains the same items as copy");
        }
    }
}
