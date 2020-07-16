package Hashmap;
import java.util.*;
public class KeyValue {
    public static void main(String[] args) {
        HashMap <Integer,String> hm= new HashMap<Integer, String>();
        hm.put(1,"you got nasty one");
        hm.put(2,"you got shoe two");
        hm.put(3,"you got three let me free");
        hm.put(4,"it's sour you got four");
        hm.put(5,"I have a knife and you fot five");

        for(Map.Entry x:hm.entrySet())
        {
            System.out.println(x.getKey()+":"+x.getValue());
        }
    }
}

/**
 * 1:you got nasty one
 * 2:you got shoe two
 * 3:you got three let me free
 * 4:it's sour you got four
 * 5:I have a knife and you fot five
 */
