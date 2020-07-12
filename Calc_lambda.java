//simple calculator using lambda function and using multiple interfaces
interface add{
    double add(double a,double b);
}
interface subtract{
    double sub(double a,double b);
}
interface multiply{
    double mul(double a,double b);
}
interface divide{
    double div(double a,double b);
}
public class Calc_lambda {
    public static void main(String[] args) {
        add a1=(a,b)->(a+b);
        System.out.println(a1.add(34.5,67.5));

        subtract a2=(a,b)->(a-b);
        System.out.println(a2.sub(56.6,23.3));

        multiply a3=(a,b)->(a*b);
        System.out.println(a3.mul(23.1,1.2));

        divide a4= (a,b)->(a/b);
        System.out.println(a4.div(45.8,23.5));

    }
}
