package Java_work.rockPaperScissor;

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
    }

    public void showMenu(){

    }

    public void chooseRole(){

    }

    public int judge(){
        return 0;
    }

    public void endGame(){

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
