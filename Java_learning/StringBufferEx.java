package Java_learning;


public class StringBufferEx {

    public static void main(String[] args){

        /*
        String str1 = "a";
        String str2 = "b";
        String str3 = str1 + str2;

        //behind the scene:
        //string with cache
        String str4 = new StringBuffer(String.valueOf(str1)).append(str2).toString();

        */

        final int A = 500000;

        //+= to put strings together
        long startime = System.currentTimeMillis();
        String str5 = "*";
        for(int i = 0; i < A; i++){

            str5 += "*";
        }

        long endtime = System.currentTimeMillis();
        System.out.println("+= used time: " + (endtime - startime) + " million seconds");

        //use stringbuffer to put string together
        startime = System.currentTimeMillis();
        StringBuffer str6 = new StringBuffer("*");
        
        for(int i = 0; i < A; i++){

            str6.append("*");
        }

        endtime = System.currentTimeMillis();
        System.out.println("string buffer used time: " + (endtime - startime) + " million seconds");

        
        //use stringbuilder to put string together (upgraded string buffer)
        startime = System.currentTimeMillis();
        StringBuilder str7 = new StringBuilder("*");
        
        for(int i = 0; i < A; i++){

            str7.append("*");
        }

        endtime = System.currentTimeMillis();
        System.out.println("string builder used time: " + (endtime - startime) + " million seconds");


        /*
        string buffer do not create new string everytime, change the string in the cache
        string builder is not thread safe, cannot be access simutaneously
        */


        //three ways of create a string buffer
        StringBuffer str8 = new StringBuffer(); //can have 16 character cache
        StringBuffer str9 = new StringBuffer("abc");    
        //have 16 more character cache than the entered string and append the entered string to the buffer
        StringBuffer str10 = new StringBuffer(48);
        //indicate there are 48 chracter cache, if the capacity exceed it would double the size


        //method in string buffer
        StringBuffer str11 = new StringBuffer("Hello World!");
        str11.append('a');
        str11.append(1234L);
        //very powerful and quick method!
        System.out.println(str11.reverse());
        //reverse the string
        str11.insert(3,3L);
        //print abc on the third element
        str11.deleteCharAt(3);
        str11.delete(2, 4); //delete [2,4) th element
        str11.replace(2, 4, "Weeeeehoooo"); //replace the [2,4) elements

        str11.setCharAt(3, 'O');    //set the position to the indicated char
        str11.capacity();   //return the cache of the stringbuffer

        str11.setLength(0); //clear the stringbuffer

    }
    
}
