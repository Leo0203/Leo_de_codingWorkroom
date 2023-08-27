package Java_work;

import java.util.Scanner;

public class decimalPoint {
    /**
     * judge if the string passed a proper decimal number: 
     * only one decimal point, decimal point could not be in the first place or last place
     * (use string method)
     * @param str
     * @return
     */
    public static boolean isDecimal(String str){

        boolean isDecimal  = true;
        
        //judge if it is a number
        for(int i = 0; i < str.length(); i++){
            if(!Character.isDigit(str.charAt(i)) && str.charAt(i) != '.'){
                //not a number
                isDecimal = false;
                break;    
            }

            if(str.charAt(i) == '.'){
                if( i == 0 || i == str.length() - 1){
                    //decimal point at the front or the last
                    isDecimal = false;
                    break;
                }
            }
        }
        
        //only one decimal point: the index of the decimal point could only be one whether check the string from the begining or end
        if(str.contains(".") && str.indexOf('.') == str.lastIndexOf('.')){
            isDecimal = false;
        }


        return isDecimal;

    }

    public static void main(String arg[]){
        System.out.println("Please enter a number: ");
        Scanner userIn = new Scanner(System.in);
        String str = userIn.nextLine();
        

        if(isDecimal(str)){
            System.out.println("This is indeed a correct number!");
        }else{
            System.out.println("invalid number.");
        }

    }
    
}
