package Hashmap;
import java.util.*;
public class checkEmpty {
    public static void main(String[] args) {
        HashMap <Integer,String> hm1= new HashMap<Integer,String>();
        hm1.put(1,"one");
        hm1.put(2,"two");
        hm1.put(3,"three");
        hm1.put(4,"four");
        hm1.put(5,"five");
        System.out.println("Hashmap1:"+hm1);
        boolean result= hm1.isEmpty();
        System.out.println("Is HashMap empty:"+result);

        hm1.clear();
        result=hm1.isEmpty();
        System.out.println("Is HashMap empty:"+result);


    }
}

/**
 * Hashmap1:{1=one, 2=two, 3=three, 4=four, 5=five}
 * Is HashMap empty:false
 * Is HashMap empty:true
 */
