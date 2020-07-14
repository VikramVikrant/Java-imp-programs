public class Passenger {
    int pnr;
    String name;
    String source;
    String dest;

    Passenger(int pnr,String name,String source,String dest)
    {
        this.pnr=pnr;
        this.name=name;
        this.source=source;
        this.dest=dest;
    }

    public static void main(String[] args) {
        Passenger p1= new Passenger(123,"Vikrant","Bhubneshwar","Purnea");
        Passenger p2= new Passenger(457,"Rajeev","Mumbai","Srinagar");

        System.out.println(p1);
        System.out.println(p2);
    }
}
/**
 * As you can see in the above example, printing p1 and p2 prints the hashcode values of the objects but I want to print
 * the values of these objects. Since java compiler internally calls toString() method, overriding this method will
 * return the specified values.
 */

//output:
//Passenger@6acbcfc0
//Passenger@5f184fc6