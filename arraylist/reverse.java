package arraylist;
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        List <String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Pink");
        colors.add("Black");
        colors.add("White");
        System.out.println("Elements before reversing:"+colors);
        Collections.reverse(colors);
        System.out.println("______________________________");
        System.out.println("Elements after reversing:"+colors);
    }
}

/**
 * Elements before reversing:[Red, Blue, Green, Orange, Pink, Black, White]
 * ______________________________
 * Elements after reversing:[White, Black, Pink, Orange, Green, Blue, Red]
 */
