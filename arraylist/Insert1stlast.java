package arraylist;
import java.util.*;

public class Insert1stlast {
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
        colors.add(0,"Grey");
        colors.add(7,"Purple");
        System.out.println(colors);
    }
}
/**
 * [Red, Blue, Green, Orange, Pink, Black, White]
 * [Grey, Red, Blue, Green, Orange, Pink, Black, Purple, White]
 */
