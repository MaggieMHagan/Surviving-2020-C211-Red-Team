//Red Team - Lance, Maggie and Abi

package GUI;

import java.util.*;

public class game
{
    
    //initializes arraylist to hold PlayerScore objects  
   public static ArrayList<Integer> scoreList = new ArrayList<>();
    
    //initializes arraylist to hold PlayerScore objects
    ArrayList<PlayerScore> listOfPlayers = new ArrayList<PlayerScore>();
   
    //allows arraylist to be copied over into other classes
    public ArrayList<PlayerScore> getList()
    {
       return listOfPlayers; 
    }
     
     //accepts the score at the end of the game and uses it to create a new object
    //to store the player's name and score to later display
    //like an old arcade game
    public static PlayerScore newPlayer(int score)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter your name: ");
        String name = scan.nextLine();
        
        PlayerScore player = new PlayerScore(name, score);
        
        return player;
    }
    
    
    //method to display high score at the end of the game
    public void scoreDisplay(ArrayList<PlayerScore> listOfPlayers)
    {
        System.out.println("High Scores");
        System.out.println("_____________");
        for(PlayerScore i : listOfPlayers)
        {
            System.out.println(i);
        }
                
    }
    
   //Stores running score values in an array list
    public static ArrayList<Integer> runningScore(int questionValue) {

        scoreList.add(questionValue);

        return scoreList;
    }
 
    
    //sums the array list to get overall score
    public static int sum() {
        int sum = 0;

        System.out.println("SUM BEFORE" + sum);

        for (int i : scoreList) {
            sum += i;
        }

        System.out.println(sum);
     
        return sum;
    }

}
  

