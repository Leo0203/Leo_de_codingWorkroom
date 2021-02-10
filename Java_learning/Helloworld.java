package Java_learning;

public class Helloworld
{   
    //public: modifler
    //class: category
    //Helloworld: name
    public static void main(String[] args)
    {
        //String[] args: 命令行参数(name: args(cannot change); one char array)
        //System.out.println("Hello world");
        System.out.println(args[0]); //print whatever after $java Helloworld 
        //println -> print + line(return)
    }
    //javac -> compile
    //java -> execute
}
