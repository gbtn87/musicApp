/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mark_5;

/**
 *
 * @author Gustavo
 */
public class Session
{
    public int sessionNum;
    public int rightAnswers;
    public int hints;
    public phases gamePhase;
    Round currentRound;    
    
    /**
     * Sets the first round of this particular session
     * Sets the game into "wait" mode
     */
    Session()
    {
        currentRound = new Round(1, "");
        gamePhase = phases.wait;
    }
    
    /**
     * @return a String with a welcome message
     */
    public static String Welcome()
    {
        return ("Welcome to the game! "
                + "\nLet's begin!"
                + " Press Start\n");
    }
    
    /**
     * Show an overview of this practice session
     * Shows the num. of right answers and the num. of times the user used the
     * "Hint" window
     * @return A String to be appended in the textArea of the GUI
     */
    public String showSessionResults()
    {        
        String sessionResult = "";
        sessionResult += ("\nSession finished!\n");
        sessionResult += ("You answered " + rightAnswers + "/10 correctly!\n");
        if (rightAnswers < 9)
            sessionResult += ("Keep Practicing!\n");
        else if(rightAnswers < 10)
        {
            sessionResult += "Almost Perfect!\n";        
            sessionResult += "Keep Practicing!\n";
        }
        else
            sessionResult += ("Perfect!\nCongratulations!\n");
        sessionResult += ("You've used Hint " + hints + " times.\n");
        return sessionResult;
    }
    
    /**
     * Shows the result (correct/incorrect) of this particular round
     * in the practice session
     * @return A String to be appended in the textArea of the GUI
     */
    public String roundResult()
    {
        String roundResult;
        boolean answer = Round.checkUserGuess(currentRound.note,
                currentRound.userGuess);
        if (answer)
        {
            roundResult = "\nThat is correct\n";
            rightAnswers++;
        }
        else
            roundResult = "\nThat is incorrect\n";
        return roundResult;
    }
    
    /**
     * Sets the user guess as soon as the user clicks on the List
     * @param userGuessNote 
     */
    void setUserGuess(String userGuessNote) {
        currentRound.userGuess = userGuessNote;
    }
}
