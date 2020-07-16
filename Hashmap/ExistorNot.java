package Hashmap;
import java.util.*;
public class ExistorNot {
    public static void main(String[] args) {
        HashMap <Integer,String> hm1= new HashMap<Integer,String>();
        hm1.put(1,"one");
        hm1.put(2,"two");
        hm1.put(3,"three");
        hm1.put(4,"four");
        hm1.put(5,"five");
        System.out.println("Hashmap1:"+hm1);
        System.out.println("1.Is 4 exist?");
        if(hm1.containsKey(4))
        {
            System.out.println("Yes!!"+hm1.get(4)+" exists.");
        }
        else
        {
            System.out.println("No!! The key doesn't exist.");
        }
        System.out.println("2.Is 6 exist?");
        if(hm1.containsKey(6))
        {
            System.out.println("Yes!!"+hm1.get(6)+"exist.");
        }
        else
        {
            System.out.println("No!! The key doesn't exist.");
        }
    }
}
