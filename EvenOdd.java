interface Answerable
{
    String something();
}
interface Predicate
{
    boolean test(Integer n);
}


public class EvenOdd {
    public static void main(String[] args) {
        Answerable a1= () -> "I have to write something into this";
        System.out.println(a1.something());

        System.out.println("---------CHECKING ODD------------");
        Predicate isOdd = n -> n%2 != 0;
        System.out.println(isOdd.test(5));
        System.out.println(isOdd.test(8));

        System.out.println("----------CHECKING EVEN-----------");
        Predicate isEven = n -> n%2 == 0;
        System.out.println(isEven.test(4));
        System.out.println(isEven.test(9));
    }
}
