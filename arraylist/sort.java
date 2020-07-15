package arraylist;
import java.util.*;
public class sort {
    public static void main(String[] args) {
        List <String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Pink");
        colors.add("Black");
        colors.add("White");
        System.out.println("Arraylist before sorting:>"+colors);
        Collections.sort(colors);
        System.out.println("Arraylist after sorting:"+colors);
    }
}

/**
 * Arraylist before sorting:>[Red, Blue, Green, Orange, Pink, Black, White]
 * Arraylist after sorting:[Black, Blue, Green, Orange, Pink, Red, White]
 */
