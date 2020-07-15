package arraylist;
import java.util.*;
public class extract {
    public static void main(String[] args) {
        List <String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Pink");
        colors.add("Black");
        colors.add("White");
        System.out.println("Original arraylist:>"+colors);
        List <String> sublist = colors.subList(0,3);
        System.out.println("Sublist:"+sublist);
    }
}

/**
 * Original arraylist:>[Red, Blue, Green, Orange, Pink, Black, White]
 * Sublist:[Red, Blue, Green]
 */
