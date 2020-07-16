package linkedlist;
import java.util.*;
public class insertAtPos {
    public static void main(String[] args) {
        LinkedList <String> l1 =new LinkedList<String>();
        l1.add("Red Brick");
        l1.add("Falcon brown");
        l1.add("Grey metal");
        l1.add("Black shadow");
        l1.add("Dark matter");
        l1.add("Combustion blue");
        System.out.println("Original linked list:"+l1);

        System.out.println("After adding at index 3:");
        l1.add(3,"volcano orange");
        System.out.println("New LinkedList:"+l1);
    }
}

/**
 * Original linked list:[Red Brick, Falcon brown, Grey metal, Black shadow, Dark matter, Combustion blue]
 * After adding at index 3:
 * New LinkedList:[Red Brick, Falcon brown, Grey metal, volcano orange, Black shadow, Dark matter, Combustion blue]
 */
