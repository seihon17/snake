
import java.awt.Color;
/**
 * 
 * @author paseihon
 */
public class Player {

    private String name;
    private int playerPosn;
    private int playerScore;
    private Color playerColor;

    public Player(int no) {
        name = "Player " + no;
        playerPosn = 0;
    }

    public int getPosition() {
        return playerPosn;
    }

    public String getName() {
        return name;
    }
/**
 * 
 * @param posn 
 */
    public void setPosition(int posn) {
        playerPosn = posn;
    }
/**
 * 
 * @param posn 
 */
    public void incPosition(int posn) {
        playerPosn += posn;
    }
/**
 * 
 * @param c 
 */
    public void setPlayerColor(Color c) {
        playerColor = c;
        
    }

    public Color getPlayerColor() {
        return playerColor;
    }
/**
 * 
 * @param a 
 */
    public void incPlayerScore(int a) {
        playerScore += a;
    }

    public int getPlayerScore() {
        return playerScore;
    }

}
