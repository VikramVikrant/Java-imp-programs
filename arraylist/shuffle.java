package arraylist;
import java.util.*;
public class shuffle {
    public static void main(String[] args) {
        List <String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Pink");
        colors.add("Black");
        colors.add("White");
        System.out.println("Data before shuffling:"+colors);
        Collections.shuffle(colors);
        System.out.println("Data after shuffling:"+colors);
    }
}

/**
 * Data before shuffling:[Red, Blue, Green, Orange, Pink, Black, White]
 * Data after shuffling:[Pink, Orange, Blue, White, Green, Red, Black]
 */
