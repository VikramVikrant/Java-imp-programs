public class minmax {
    public static void main(String[] args) {
        System.out.println("To find the maximum and minimum in an array.");
        int a[]=new int[]{10,56,5,32,7};
        for(int a1:a)
        {
            System.out.println(a1);
        }

        int min=a[0]; //mean calculation starts
        for(int i=1;i<a.length;i++)
        {
            if(min>a[i])
            {
                min=a[i];
            }

        }
        System.out.println("smallest no in the array:"+min);//min calculation ends

        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(max<a[i])
            {max=a[i];}
        }

        System.out.println("largest no in the array:"+max);
    }
}
