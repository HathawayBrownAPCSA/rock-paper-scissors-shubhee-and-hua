
/**
 * Runs a rock paper scissors match where players loses
 *
 * @Shubhee @Hua
 * @version 20211006
 */
public class RPSMatch4
{
    //variables
    private String humanPlay = "";
    private String prevHumanPlay = "";
    private String computerPlay;
    private int humanWins;
    private int computerWins;
    private int ties;
    
    /**Constructor for RPSMatch4
     * @param humanScore, computerScore, ties
     */
    public RPSMatch4(int hSc, int cSc, int t)
    {
       humanWins = hSc;
       computerWins = cSc;
       ties = t;
    }
    
    /**gets the computer's play
     * @return computerPlay
     */
    public String getComputerPlay ()
    {
        if((int)(Math.random() * 8) != 1)
        {
            if(humanPlay.equals("rock"))
            {
                computerPlay = "paper";
            }
            if(humanPlay.equals("paper"))
            {
                computerPlay = "scissors";
            }
            if(humanPlay.equals("scissors"))
            {
                computerPlay = "rock";
            }
            return computerPlay;
        }
        else
        {
            //no cheats
            int play = (int)(Math.random() * 3);
            if (play == 1)
            {
               computerPlay = "rock";
                return "rock";
            }
            else if (play == 0)
            {
                computerPlay = "paper";
                return "paper";
            }
            else
            {
                computerPlay = "scissors";
                return "scissors";
            }
        }
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
