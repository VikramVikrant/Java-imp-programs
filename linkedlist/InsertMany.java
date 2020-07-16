package linkedlist;
import java.util.*;
public class InsertMany {
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

        LinkedList <String> l2 = new LinkedList<String>();
        l2.add("Plant Green");
        l2.add("Lust Red");
        l2.add("wood skin");
        l1.addAll(1,l2);
        System.out.println("After insertion of new list at index 1:>"+l1);
    }
}

/**
 * Original linked list:[Red Brick, Falcon brown, Grey metal, Volcano orange, Black shadow, Dark matter, Combustion blue]
 * After insertion of new list at index 1:>[Red Brick, Plant Green, Lust Red, wood skin, Falcon brown, Grey metal, Volcano orange, Black shadow, Dark matter, Combustion blue]
 */
