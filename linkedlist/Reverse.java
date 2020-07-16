package linkedlist;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        LinkedList <String> l1 =new LinkedList<String>();
        l1.add("Red Brick");
        l1.add("Falcon brown");
        l1.add("Grey metal");
        l1.add("Black shadow");
        l1.add("Dark matter");
        l1.add("Combustion blue");
        System.out.println("Original linked list:"+l1);
        Iterator i= l1.descendingIterator();
        System.out.println("Element after reversing......................");
        while (i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}

/**
 * Original linked list:[Red Brick, Falcon brown, Grey metal, Black shadow, Dark matter, Combustion blue]
 * Element after reversing......................
 * Combustion blue
 * Dark matter
 * Black shadow
 * Grey metal
 * Falcon brown
 * Red Brick
 */
