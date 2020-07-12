//program to copy from one array to another array
public class copy {
    public static void main(String[] args) {
        int []copyfrom={23,45,56,12,34,72,19,98,76,65};
        int []copyto= new int[10];
        System.arraycopy(copyfrom,0,copyto,0,10);

        for(int cc:copyto)
        {
            System.out.println(cc);
        }
    }
}
