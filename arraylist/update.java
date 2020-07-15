package arraylist;
import java.util.*;
public class update {
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

        //update the third element to brick red
        colors.set(2,"Brick Red");
        System.out.println(colors);
    }
}

/**
 * [Red, Blue, Green, Orange, Pink, Black, White]
 * [Red, Blue, Brick Red, Orange, Pink, Black, White]
 */
