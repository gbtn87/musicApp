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
public class Session {

    int sessionNum;
    int rightAnswers;
    int hints;
    phases gamePhase;
    Round currentRound;
    
    
    Session()
    {
        //Todos os preparativos para quando uma nova sessão é iniciada.
        //Levar em consideração que isso vale para "Restart" e para "New Session"
        currentRound = new Round(1, "");
        gamePhase = phases.wait;
    }
    
    public static String Welcome()
    {
        return ("Welcome to the game! "
                + "\nLet's begin!"
                + " Press Start\n");
    }
    
        public String showSessionResults()
    {
        /*
        rightAnswers deve ficar aqui
        */
        
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

    void setUserGuess(String userGuessNote) {
        currentRound.userGuess = userGuessNote;
    }
    
    public String playRound()
    {
        currentRound.roundNum++;
        return roundResult();
    }
}
