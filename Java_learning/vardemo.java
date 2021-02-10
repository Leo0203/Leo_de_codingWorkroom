package Java_learning;

public class vardemo 
{
    public static void main(String args[])
    {
        String name = "Warrior";
        int number = 1;
        double health = 500;
        double damage = 5;
        String skills = "none";

        System.out.println("Hero number: " + number);       //use "+" to connect
        //System.out.printf("Hero number: %d\n", number);   same output as line 11
        System.out.println("Hero name: " + name);
        System.out.println("Hero health: " + health);
        //System.out.printf("Hero health: %.2f", health);   output: 500.00 default%f output: 500.000000
        System.out.println("Hero damage: " + damage);
        System.out.println("Hero skills: " + skills);

        /*
        String str = String.format("%d", number);
        System.out.printf(str);
        can also print number
        */
    }
}
