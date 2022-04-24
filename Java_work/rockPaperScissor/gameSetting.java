package Java_work.rockPaperScissor;

import java.util.Scanner;

public class gameSetting {

    //element: score record, players, room id, room name, room passwords
    //method: begin the game, initialize the game, show menu, show players, judge winner

    private characters humanPlayer = null;
    private robot comPlayer = null;
    private String roomName;
    private String roomPass;
    private long roomID;

    public gameSetting(){
        initGame();
        startGame();
        endGame();
    }

    public void initGame(){

        //realize players
        humanPlayer = new characters();
        comPlayer = new robot();
        //initialize other features
        for(int i = 0; i < 30; i++){
            System.out.print("*");
            try{
                Thread.sleep(50);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Game Loaded");

    }

    public void startGame(){
        showMenu();
        chooseRole();
        //place fists -> judge -> result
        System.out.print(humanPlayer.getName() + " Please place your fist: ");
        humanPlayer.setFist(new Scanner(System.in).nextInt());
        int fist1 = humanPlayer.getFist();
        comPlayer.getFist();
        int fist2 = comPlayer.getFist();

        int result = judge(fist1, fist2);
        //return -1, human win; return 0, draw; return 1 computer win
        

    }

    public void showMenu(){
        System.out.println("Hello!");
        System.out.println("Welcome to play rock paper scissors with me. ");
        System.out.println("I assume you know the rules...");
    }

    public void chooseRole(){
        System.out.println("Please choose your chracter: 1. Mime Terriorst 2. Strong Dog 3. Nerd Bully 4. Doctor Genie: ");
        int choice = new Scanner(System.in).nextInt();
        String[] nameArray = {"Mime Terriorist", "Strong Dog", "Nerd Bully", "Docto Genie"};

        humanPlayer.setName(nameArray[choice - 1]);
        comPlayer.setName("Almighty Dater");
        System.out.println(humanPlayer.getName() + " vs. " + comPlayer.getName());
    }

    public int judge(int fist1, int fist2){
        if(fist1 == fist2){return 0;}
        if(fist1 == 1 && fist2 == 3 || fist1 == 2 && fist2 == 1 || fist1 == 3 && fist2 == 2){

            humanPlayer.setScore(humanPlayer.getScore() + 1);
            comPlayer.setScore(comPlayer.getScore() - 1);
            return -1;
        }else{
            return 1;
        }
        
    }

    public void endGame(){
        System.out.println("Ends!");
    }

    public characters getHumanPlayer() {
        return humanPlayer;
    }
    public void setHumanPlayer(characters humanPlayer) {
        this.humanPlayer = humanPlayer;
    }
    public robot getComPlayer() {
        return comPlayer;
    }
    public void setComPlayer(robot comPlayer) {
        this.comPlayer = comPlayer;
    }
    public String getRoomName() {
        return roomName;
    }
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
    public String getRoomPass() {
        return roomPass;
    }
    public void setRoomPass(String roomPass) {
        this.roomPass = roomPass;
    }
    public long getRoomID() {
        return roomID;
    }
    public void setRoomID(long roomID) {
        this.roomID = roomID;
    }


    
}
