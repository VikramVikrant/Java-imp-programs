//lambda function was introduced in java se8
interface Sayable{
    public String say(String name);
}

public class singlepar_lambda {
    public static void main(String[] args) {
        Sayable s1 = (name) -> {
            return "Welcome," + name;
        };
        System.out.println(s1.say("Mr.Stark"));

        Sayable s2= (name) -> {return "Hello,"+name;};
        System.out.println(s2.say("Miss Pots"));
    }
}
