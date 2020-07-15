package linkedlist;
import java.util.*;
public class iterate {
    public static void main(String[] args) {
        LinkedList <String> ll1 = new LinkedList<String>();
        ll1.add("Ram");
        ll1.add("Shyam");
        ll1.add("Ghanshyam");
        ll1.add("Dhanush");
        ll1.add("Sarish");
        for(String data:ll1)
        {
            System.out.println(data);
        }
    }
}

/**
 * Ram
 * Shyam
 * Ghanshyam
 * Dhanush
 * Sarish
 */
