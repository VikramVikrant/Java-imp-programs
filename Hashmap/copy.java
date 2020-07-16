package Hashmap;
import java.util.*;
public class copy {
    public static void main(String[] args) {
        HashMap <Integer,String> hm1= new HashMap<Integer,String>();
        hm1.put(1,"one");
        hm1.put(2,"two");
        hm1.put(3,"three");
        hm1.put(4,"four");
        System.out.println("Hashmap1:"+hm1);
        HashMap <Integer,String> hm2 = new HashMap<Integer, String>();
        hm2.put(5,"five");
        hm2.put(6,"six");
        hm2.put(7,"seven");
        hm2.put(8,"eight");
        System.out.println("Hashmap2:"+hm2);
        System.out.println("___________________");
        hm2.putAll(hm1);
        System.out.println("New Hashmap2:"+hm2);

    }
}

/**
 * Hashmap1:{1=one, 2=two, 3=three, 4=four}
 * Hashmap2:{5=five, 6=six, 7=seven, 8=eight}
 * ___________________
 * New Hashmap2:{1=one, 2=two, 3=three, 4=four, 5=five, 6=six, 7=seven, 8=eight}
 */
