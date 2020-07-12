import java.util.Scanner;

public class sametesting2 {
    public static void main(String[] args) {
        int i,n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no. of elements:");
        n=s.nextInt();
        int a[]=new int[n];

        for(i=0;i<a.length;i++)
        {
            System.out.println("Enter elements "+(i+1)+":");
            a[i]=s.nextInt();
        }

        System.out.println("Elements are:");
        for(int a1:a)
        {

            System.out.println(a1);
        }
    }
}
