package arraylist;
import java.util.*;
public class copy {
    public static void main(String[] args) {
        List <String> data1=new ArrayList<String>();
        data1.add("1");
        data1.add("2");
        data1.add("3");
        data1.add("4");
        data1.add("5");
        System.out.println("Elements of data1:"+data1);
        List <String> data2=new ArrayList<String>();
        data2.add("A");
        data2.add("B");
        data2.add("C");
        data2.add("D");
        data2.add("E");
        System.out.println(data2);
        Collections.copy(data1,data2);
        System.out.println("After copying elements................");
        System.out.println("data1:"+data1);
        System.out.println("data2:"+data2);
    }
}

/**
 * Elements of data1:[1, 2, 3, 4, 5]
 * [A, B, C, D, E]
 * After copying elements................
 * data1:[A, B, C, D, E]
 * data2:[A, B, C, D, E]
 */
