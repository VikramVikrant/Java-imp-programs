package arraylist;
import java.util.*;
public class retreive {
    public static void main(String[] args) {
        List <String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Pink");
        colors.add("Black");
        colors.add("White");
        System.out.println(colors);

        String element = colors.get(0);
        System.out.println("First element: "+element);
        element=colors.get(5);
        System.out.println("Sixth element: "+element);
    }
}

/**
 * [Red, Blue, Green, Orange, Pink, Black, White]
 * First element: Red
 * Sixth element: Black
 */
