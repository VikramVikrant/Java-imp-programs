package linkedlist;
import java.util.*;
public class UsingIterator {
    public static void main(String[] args) {
        LinkedList <String> l1 =new LinkedList<String>();
        l1.add("Red Brick");
        l1.add("Falcon brown");
        l1.add("Grey metal");
        l1.add("Black shadow");
        l1.add("Dark matter");
        l1.add("Combustion blue");

        Iterator p= l1.listIterator(1);//Setting the index from which iteration starts

        while (p.hasNext())
        {
            System.out.println(p.next());
        }


    }
}

/**
 * Falcon brown
 * Grey metal
 * Black shadow
 * Dark matter
 * Combustion blue
 */
