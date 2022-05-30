package Java_work.login;

/**
 * some method to judge whether the parameter is a valid string
 */
public class StringUtil {

    /**
     * judge whether a name entered a proper name
     * name up to 25 character: no spaces, qutation marks, special characters 
     * @param name
     * @return
     */
    public static boolean isValidName(String name){

        boolean isValid = true;

        if(name == null){
            return false;
        }

        if(name.length() > 25){
            return false;
        }

        char[] invalidCharacter = {' ', '\'', '"', '?', ','};
        for(char ch: invalidCharacter){
            if(name.contains(Character.toString(ch))){
                //contains invalid chracters
                isValid = false;
                break;
            }
        }




        return isValid;

    }
    
    /**
     * password 6 to 12 characters: only letters, numbers, and some special characters (_, @, #, $, !)
     * judge the strength of the password
     * 1. only letters/numbers -> weak
     * 2. two types of characters -> medium
     * 3. three types of characters -> strong
     * @param password
     * @return the strength of the password, if return an empty string then the validation fails
     */
    public static String ValidatePassword(String password){

        String strength = ""; 

        if(password == null) return strength;
        if(password.length() < 6 || password.length()> 12) return strength;

        //String[] specialCharUseable = {"_", "@", "#", "$", "!"};
        String part = "_@#$!";

        for(int i = 0; i < password.length(); i++){
            if(!Character.isLetterOrDigit(password.charAt(i))){
                //if not numbers, letters, special character -> invalid
                if(part.contains(Character.toString(password.charAt(i)))){
                    return strength;
                }
            }
        }
        
        //strength of the password

        if(isDigit(password) || isLetter(password)){
            strength = "weak";
        }else if(isDigitAndLetter(password)){
            strength = "moderate";
        }else if(isSpecialCharacter(password)){
            strength = "strong";
        }



        return strength;
    }

    /**
     * find if a string only contains numbers
     * @param value
     * @return
     */
    private static boolean isDigit(String value){
        for(int i = 0; i < value.length(); i++){
            if(!Character.isDigit(value.charAt(i))){
                return false;
            }
        }


        return true;

    }   

    /**
     * find if a string only contains letter
     * @param value
     * @return
     */
    private static boolean isLetter(String value){

        for(int i = 0; i < value.length(); i++){
            if(!Character.isLetter(value.charAt(i))){
                return false;
            }
        }


        return true;
    }

    /**
     * find if a special chracter is contained along with number or letters
     * @param value
     * @return
     */
    private static boolean isSpecialCharacter(String value){

        String part = "_@#$!";

        for(int i = 0; i < value.length(); i++){
            if(part.contains(Character.toString(value.charAt(i)))){
                return true;
            }
        }

        return false;
    }

    /**
     * find if a string contains both letter and digit
     * @param value
     * @return
     */
    private static boolean isDigitAndLetter(String value){

        for(int i = 0; i < value.length(); i++){
            if(!Character.isLetterOrDigit(value.charAt(i))){
                return false;
            }
        }


        return true;
    }



}
