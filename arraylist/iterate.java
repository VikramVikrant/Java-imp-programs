//Iterate through all the elements in the arraylist
package arraylist;
import java.util.*;
public class iterate {
    public static void main(String[] args) {
        List <String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Pink");
        colors.add("Black");
        colors.add("White");

        for(String data:colors)
        {
            System.out.println(data);
        }
    }
}
/**
 * Output:
 * Red
 * Blue
 * Green
 * Orange
 * Pink
 * Black
 * White
 */
