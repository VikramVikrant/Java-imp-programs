//creating an string array and find where null elements are located and where they are not
public class Stringarray {
    public static void main(String[] args) {
        String []str=new String[5];
        str[0]="vikrant";
        str[1]="vishal";
        str[2]=null;
        str[3]="cruser";
        str[4]=null;

        for(int i=0;i<str.length;i++)
        {
            if(str[i]==null)
            {
                System.out.println("Null elements are in indexes:"+i);
            }
            else
            {
                System.out.println("String elements:"+str[i]);
            }
        }
    }
}
