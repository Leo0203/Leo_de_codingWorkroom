package Java_work;

import java.util.*;
import java.math.*;

public class chess{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // String pawn = "P";
        // String knight = "k";
        // String bishop = "B";
        // String rook = "R";
        // String queen = "Q";
        // String King = "K";

        String board[][] = new String[8][8];
        String move;

        initializeTheBoard(board);

        System.out.print("Enter the move (in the format WPe2e4): ");
        move = input.next();
        
    }

    /**
     * print the whole chess board and the pieces at the beginning of a match
     * @param board just a blank 8 x 8 board
     */
    public static void initializeTheBoard(String board[][]){

        String initialValuePiece[] = {"R", "k", "B", "Q", "K", "B", "k", "R"};

        for(int i = 0; i < 8; i++){
            board[0][i] = "B" + initialValuePiece[i] + " ";
            board[1][i] = "BP ";
            board[2][i] = "   ";
            board[3][i] = "   ";
            board[4][i] = "   ";
            board[5][i] = "   ";
            board[6][i] = "WP ";   
            board[7][i] = "W" + initialValuePiece[i] + " ";

        }
    }

    /**
     * print the whole chess board and the pieces
     * @param board the current positions of the pieces on the board
     */
    public static void printCurrentBoard(String board[][]){

        for(int i = 0; i < 8; i++){

            for(int j = 0; j < 8; j++){

                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    /**
     * 
     * @param move
     * @param board
     */
    public static void Move(String move, String board[][]){
        
        char[] moveChar = move.toCharArray();
        String piece;
        int verticalIndexI, horzontalIndexI;
        int verticalIndexF, horizontalIndexF;

        piece = "" + moveChar[0] + moveChar[1] + " ";

        verticalIndexI = convertVerticalAlphabetToIndex(moveChar[2]);
        horzontalIndexI = convertHorizontalAlphabetToIndex(moveChar[3]);

        verticalIndexF = convertVerticalAlphabetToIndex(moveChar[4]);
        horizontalIndexF = convertHorizontalAlphabetToIndex(moveChar[5]);

        board[verticalIndexF][horizontalIndexF] = piece;
        board[verticalIndexI][horzontalIndexI] = "   ";

        
            
    }

    public static int convertVerticalAlphabetToIndex(char verticalAlphabet){

        int verticalIndex = -1;

        switch(verticalAlphabet){
            case 'a': 
                verticalIndex = 0;
                break;
            case 'b': 
                verticalIndex = 1;
                break;
            case 'c': 
                verticalIndex = 2;
                break;  
            case 'd': 
                verticalIndex = 3;
                break;
            case 'e': 
                verticalIndex = 4;
                break;
            case 'f': 
                verticalIndex = 5;
                break;
            case 'g': 
                verticalIndex = 6;
                break;
            case 'h': 
                verticalIndex = 7;
                break;
            default:
                System.out.println("This is not a valid location for a piece. ");    
                break;

        }

        return  verticalIndex;
        
    }

    public static int convertHorizontalAlphabetToIndex(char horizontalAlphabet){

        int horizontalIndex = -1;

        switch(horizontalAlphabet){
            case '1': 
            horizontalIndex = 0;
                break;
            case '2': 
                horizontalIndex = 1;
                break;
            case '3': 
                horizontalIndex = 2;
                break;  
            case '4': 
                horizontalIndex = 3;
                break;
            case '5': 
                horizontalIndex = 4;
                break;
            case '6': 
                horizontalIndex = 5;
                break;
            case '7': 
                horizontalIndex = 6;
                break;
            case '8': 
                horizontalIndex = 7;
                break;
            default:
                System.out.println("This is not a valid location for a piece. ");    
                break;

        }

        return  horizontalIndex;
        
    }

}
