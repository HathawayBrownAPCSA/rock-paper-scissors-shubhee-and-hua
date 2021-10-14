
/**
 * Runs a rock paper scissors match without random plays
 *
 * @Shubhee @Hua
 * @version 20211006
 */
    
public class RPSMatch3
{
    //variables
    private int numMatch = 0;
    private String humanPlay = "";
    private String prevHumanPlay = "";
    private String computerPlay;
    private String[] plays = {"rock", "paper", "scissors", "paper", "rock", "scissors", "paper"};
    private int humanWins;
    private int computerWins;
    private int ties;
    
    /**Constructor for RPSMatch3
     * @param humanScore, computerScore, ties
     */
    public RPSMatch3(int hSc, int cSc, int t)
    {
       humanWins = hSc;
       computerWins = cSc;
       ties = t;
    }
    
    /**gets the computer's play from the array
     * @return computerPlay
     */
    public String getComputerPlay ()
    {
        if(numMatch >= 7)
        {
            numMatch %= 7;
        }
        computerPlay = plays[numMatch];
        numMatch ++;
        return computerPlay;
    }

    
    /** sets human play to input
     * @param a new human play
     */
    
    public void setHumanPlay (String a)
    {
        prevHumanPlay = humanPlay;
        humanPlay = a;
    }
    
    /**gets the result of the rock paper scissors
     * @return a win loss or ite message
     */
    public String getResult()
    {
        if (humanPlay.equals(computerPlay))
        {
            ties += 1;
            return "Tie";
        }
        else if (humanPlay.equals("rock"))
        {
            if(computerPlay.equals("paper"))
            {
                computerWins += 1;
                return "You lose! Better luck next time!";
            }
            else
            {
                humanWins += 1;
                return "You win!";
            }
        }  
        else if (humanPlay.equals("paper"))
        {
            if(computerPlay.equals("scissors"))
            {
                computerWins += 1;
                return "You lose! Better luck next time!";
            }
            else
            {
                humanWins += 1;
                return "You win!";
            }
        }
        else
        {
            if(computerPlay.equals("rock"))
            {
                computerWins += 1;
                return "You lose! Better luck next time!";
            }
            else
            {
                humanWins += 1;
                return "You win!";
            }
        }
    }
    
    /** gets human wins
     * @return human wins
     */
    public int getHumanWins()
    {
        return humanWins;
    }
    
    /** gets computer wins
     * @return computer wins
     */
    public int getComputerWins()
    {
        return computerWins;
    }
    
    /** gets ties
     * @return ties
     */
    public int getTies()
    {
        return ties;
    }
}
