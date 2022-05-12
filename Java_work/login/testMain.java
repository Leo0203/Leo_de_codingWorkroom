package Java_work.login;

import java.util.Scanner;

public class testMain {

    /**
     * create a login system: create new account, login
     * 1. name up to 25 character: no ' ', '\'', '"', '?', ','
     * 2. password 6 to 12 characters: only letters, numbers, and some special characters
     * 3. email: contains @ and only one @, not at the front or end
     */
    public static void main(String args[]){

        Scanner userIn = new Scanner(System.in);


        //user account create
        System.out.print("Please enter a name: ");
        String userName = userIn.nextLine();

        System.out.print("Please enter the password: ");
        String password = userIn.nextLine();
        System.out.print("Please enter your email: ");
        String email = userIn.nextLine();


        
    }
    
}
