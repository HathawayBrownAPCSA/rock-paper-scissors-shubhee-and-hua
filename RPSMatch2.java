
/**
 * Runs a rock paper scissors match(tie edition)
 *
 * @Shubhee @Hua
 * @version 20211006
 */
public class RPSMatch2
{
    //variables
    private String humanPlay = "";
    private String prevHumanPlay = "";
    private String computerPlay;
    private int humanWins;
    private int computerWins;
    private int ties;
    
    /**Constructor for RPSMatch2
     * @param humanScore, computerScore, ties
     */
    public RPSMatch2(int hW, int cW, int t)
    {
       humanWins = hW;
       computerWins = cW;
       ties = t;
    }
    
    /**gets the computer's play
     * @return computerPlay
     */
    public String getComputerPlay ()
    {
        if((int)(Math.random() * 4) != 1)
        {
            computerPlay = humanPlay;
        }
        else 
        {
            int play = (int)(Math.random() * 3);
            if (play == 1)
            {
               computerPlay = "rock";
            }
            else if (play == 0)
            {
                computerPlay = "paper";
            }
            else
            {
                computerPlay = "scissors";
            }
        }
        return computerPlay;
    }
    
    /** sets human play to input
     * also sets the 
     * @param a new human play
     */
    public void setHumanPlay (String a)
    {
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

