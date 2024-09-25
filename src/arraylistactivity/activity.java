package arraylistactivity;

public class activity {
    private int playerNumber;
    private String Name;
    private int score;
    
    public activity (int playerNumber, String Name, int score) {
        this.playerNumber = playerNumber;
        this.Name = Name;
        this.score = score;                
    }
    
    public int getplayerNumber() {
        return playerNumber;
    }
    
    public String getName() {
        return Name;
    }
    
    public int getscore() {
        return score;
    }
    
    public String toString() {
        return "Player: " + "\nplayerNumber = " + playerNumber + "\nName = " + Name +
                '\'' + "\nscore = " + score;
    }
    
}
