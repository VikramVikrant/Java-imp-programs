import java.util.Scanner;

public class testing2 {
    public static void main(String[] args) {
        System.out.println("Testing2");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no. of elements:");
        int n= s.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter elements:");
            arr1[i]=s.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            System.out.println("Element"+(i+1)+":"+arr1[i]);

        }

    }
}
