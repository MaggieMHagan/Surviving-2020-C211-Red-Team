//Red Team - Lance, Maggie and Abi
//Plans for a future high score screen

package GUI;


public class PlayerScore 
{
     // Instance varibles
    private String playerName; 
    private int playerScore;
     
    //default constructor
    public PlayerScore()
    {
          playerName = "";
          playerScore = 0;
    }
    
      //object that contains player's name and their score
    public PlayerScore (String name, int score)
    {
        playerName = name;
        playerScore = score;
    }
    
    //getters
    public String getName()
    {
        return playerName;
    }
    
    public int getScore()
    {
        return playerScore;
    }
    
    //setters
    public void setName(String name)
    {
        playerName = name;
    }
    
    public void setScore(int score)
    {
        playerScore = score;
    }
    
    //returns a string representation of the object
    public String toString()
    {
        String result;
        result = "Player Name: " + playerName + "\tPlayer Score: " + playerScore;
        return result;
    }        
    
    
}