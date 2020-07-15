package arraylist;
import java.util.*;
public class search {
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

        if(colors.contains("Pink"))
        {
            System.out.println("It contains pink.");
        }
        else
        {
            System.out.println("It doesnot contains pink.");
        }
    }
}

/**
 * [Red, Blue, Green, Orange, Pink, Black, White]
 * It contains pink.
 */
