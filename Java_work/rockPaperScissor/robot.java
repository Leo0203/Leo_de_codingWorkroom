package Java_work.rockPaperScissor;

public class robot {

    //same element with characters
    //robot represents the computer players

    private String name;
    private int score;
    private int fist;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public int getFist() {
        fist  = (int) Math.random() * 3 + 1;
        return fist;
    }
    

    
    
}
