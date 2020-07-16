package Hashmap;
import java.util.*;
public class removeAll {
    public static void main(String[] args) {
        HashMap <Integer,String> hm1= new HashMap<Integer,String>();
        hm1.put(1,"one");
        hm1.put(2,"two");
        hm1.put(3,"three");
        hm1.put(4,"four");
        System.out.println("Hashmap1:"+hm1);

        hm1.clear();
        System.out.println("Present Hashmap1:"+hm1);
    }
}

/**
 * Hashmap1:{1=one, 2=two, 3=three, 4=four}
 * Present Hashmap1:{}
 */
