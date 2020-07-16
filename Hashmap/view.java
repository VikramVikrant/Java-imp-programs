//To print keyset and value pairs independently
package Hashmap;
import java.util.*;
public class view {
    public static void main(String[] args) {
        HashMap <Integer,String> hm1= new HashMap<Integer,String>();
        hm1.put(1,"one");
        hm1.put(2,"two");
        hm1.put(3,"three");
        hm1.put(4,"four");
        hm1.put(5,"five");
        System.out.println("Hashmap1:"+hm1);
        System.out.println("------------------");
        System.out.println("KeySet:"+hm1.keySet());
        System.out.println("--------------------");
        System.out.println("Collection view:"+hm1.values());
    }
}

/**
 * Hashmap1:{1=one, 2=two, 3=three, 4=four, 5=five}
 * ------------------
 * KeySet:[1, 2, 3, 4, 5]
 * --------------------
 * Collection view:[one, two, three, four, five]
 */
