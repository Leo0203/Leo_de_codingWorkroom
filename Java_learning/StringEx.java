package Java_learning;

public class StringEx {

    public static void main(String[] args){

        
        //demonstrate several ways of setting up a string
        String str1 = "hello!";
        String str2 = new String();             //use construction(默认构造) -> same as String str2 = "";
        String str3 = "";
        String str4 = new String(str1);         //pass str1 hash code and value to str4

        char[] charArray = {'a', 'b', 'c'};
        String str5 = new String(charArray);    //turn the char array to a string object
        char[] charArray2 = str5.toCharArray();                     //turn the string to a char array

        //byte: -128 to 127
        byte[] byteArray = {104, 101, 108, 108, 111};
        String str6 = new String(byteArray);

        System.out.println(str2 == str3);   
        //return false, since only the content are the same, the equal sign compare the address of the strings
        System.out.println(str6);
        //return "hello", the number of the byte array represent asc code of the letters






    }
    
}
