package Java_work.rockPaperScissor;

public class characters {

    //elements: name, score, the gesture (1, rock; 2, paper; 3,scissor)
    //character represents any individual players
    private String name;
    private int score;
    private int fist;


    public characters(String name) {
        this.name = name;
    }

    public characters() {
    }

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
        return fist;
    }

    public void setFist(int fist) {
        this.fist = fist;
    }

    
}
