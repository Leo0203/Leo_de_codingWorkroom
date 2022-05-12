package Java_learning;

public class StringEx {

    public static void main(String[] args){


        //demonstrate several ways of setting up a string
        String str1 = "hello!";
        String str2 = new String();             //use construction(默认构造) -> same as String str2 = "";
        String str3 = "";

        System.out.println(str2 == str3);   
        //return false, since only the content are the same, the equal sign compare the address of the strings


        String str4 = new String(str1);         //pass str1 hash code and value to str4

        char[] charArray = {'a', 'b', 'c'};
        String str5 = new String(charArray);    //turn the char array to a string object
        char[] charArray2 = str5.toCharArray();                     //turn the string to a char array

        //byte: -128 to 127
        byte[] byteArray = {104, 101, 108, 108, 111};
        String str6 = new String(byteArray);

        System.out.println(str6);
        //return "hello", the number of the byte array represent asc code of the letters

        //string trim -> only the characters remains, the spaces (in front and after) are dropped, space in between wont be ignored
        //string char at, to upper case, to lower case all create new string
        //string.concat wont change the orginal string (point to address)

        String str7 = "abc";
        String str8 = "123";
        String str9 = str6 + str7; //does not use concat, use string buffer and return a final string, buffer waste spaces

        //compare strings
        System.out.println("abc".equals("abc"));
        System.out.println("abc".compareTo("abcd"));    
        //return = 0 -> two string are the same 
        //return > 0 -> first ascII code bigger than second
        //return < 0 -> first ascII code smaller than second

        System.out.println("abc".startsWith("a"));
        //return true if the string start with the indicated character, vice versa
        //also works with "endwith" method, "contains" method


        String str10 = "abc123456abc";
        System.out.println(str10.indexOf("3")); 
        //return 2, indicating the postion of the character
        //return -1 if the character does not exist in the string
        System.out.println(str10.indexOf("ab", 2)); //2 represent start with the third character

        //substring[begining index, ending index)
        System.out.println(str10.substring(1, 3));







    }
    
}
