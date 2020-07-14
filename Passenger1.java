public class Passenger1 {
    int pnr;
    String name;
    String source;
    String dest;

    Passenger1(int pnr,String name,String source,String dest)
    {
        this.pnr=pnr;
        this.name=name;
        this.source=source;
        this.dest=dest;
    }

    public String toString(){
        return pnr+" "+name+" "+source+" "+dest;
    }

    public static void main(String[] args) {
        Passenger1 p1= new Passenger1(123,"Vikrant","Bhubneshwar","Purnea");
        Passenger1 p2= new Passenger1(457,"Rajeev","Mumbai","Srinagar");

        System.out.println(p1);
        System.out.println(p2);
    }
}
/**
 * Output:
123 Vikrant Bhubneshwar Purnea
457 Rajeev Mumbai Srinagar
 */
