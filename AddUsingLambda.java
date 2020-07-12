//Addition using lambda function
interface Addable{
    int add(int a,int b);
}
public class AddUsingLambda {
    public static void main(String[] args) {
        Addable ad1 = (a,b)->(a+b);
        System.out.println(ad1.add(34,56));

        Addable ad2 = (a,b)->(a+b);
        System.out.println(ad1.add(100,50));


    }
}
