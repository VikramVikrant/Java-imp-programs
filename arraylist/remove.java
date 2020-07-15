package arraylist;
import java.util.*;

public class remove {
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
        //deleting the 3rd element from the arraylist
        colors.remove(2);
        System.out.println("After removing the 3rd element:\n"+colors);
    }
}
/**
 * [Red, Blue, Green, Orange, Pink, Black, White]
 * After removing the 3rd element:
 * [Red, Blue, Orange, Pink, Black, White]
 */
