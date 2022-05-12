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
     * password 6 to 12 characters: only letters, numbers, and some special characters
     * judge the strength of the password
     * 1. only letters/numbers -> weak
     * 2. two types of characters -> medium
     * 3. three types of characters -> strong
     * @param password
     * @return
     */
    public static String ValidatePassword(String password){

        String strength = ""; //the strength of the password

        return strength;
    }





}
