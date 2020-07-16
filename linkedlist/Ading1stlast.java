package linkedlist;
import java.util.*;
public class Ading1stlast {
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

        //adding element to the first
        l1.addFirst("Glacier white");
        //adding element to the last
        l1.addLast("Glittering blue");
        System.out.println("New Linked List:"+l1);
    }
}

/**
 * Original linked list:[Red Brick, Falcon brown, Grey metal, Volcano orange, Black shadow, Dark matter, Combustion blue]
 * New Linked List:[Glacier white, Red Brick, Falcon brown, Grey metal, Volcano orange, Black shadow, Dark matter, Combustion blue, Glittering blue]
 */
