package linkedlist;
import java.util.*;
public class get1stlast {
    public static void main(String[] args) {
        LinkedList <String> l1 =new LinkedList<String>();
        l1.add("Red Brick");
        l1.add("Falcon brown");
        l1.add("Grey metal");
        l1.add("Volcano orange");
        l1.add("Black shadow");
        l1.add("Dark matter");
        l1.add("Combustion blue");
        System.out.println("Original linked list:"+l1);

        Object first= l1.getFirst();
        System.out.println("First Element:"+first);

        Object last= l1.getLast();
        System.out.println("Last element:"+last);
    }
}

/**
 * Original linked list:[Red Brick, Falcon brown, Grey metal, Volcano orange, Black shadow, Dark matter, Combustion blue]
 * First Element:Red Brick
 * Last element:Combustion blue
 */
