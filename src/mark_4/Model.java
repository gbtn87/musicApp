/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mark_4;

import BusinessCode.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gustavo
 */



public class Model
{
    Note currentNote;
    private String userGuess;
    phases gamePhase;
    private boolean playing;
    private int roundNum;
    int rightAnswers = 0;
    int hints = 0;

    public int getRoundNum() {
        return roundNum;
    }

    public void setRoundNum(int roundNum) {
        this.roundNum = roundNum;
    }    
    
    public phases getGamePhase() {
        return gamePhase;
    }

    public void setGamePhase(phases gamePhase) {
        this.gamePhase = gamePhase;
    }

    public void setUserGuess(String userGuess) {
        this.userGuess = userGuess;
    }

    public String getUserGuess() {
        return userGuess;
    }

    public boolean getPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }
    
    public static String Welcome()
    {
        return ("Welcome to the game! "
                + "\nLet's begin!"
                + " Press Start\n");
    }
    
    public String printNoteOnStaff()
    {
        
        String noteSt = "";
        /*
        Se a posição da nota recebida é igual a "i"
        print o espaço/linha com a nota;
        */
        for (int i = 10; i >= 0; i--) {
            if (i%2 == 0)
            {
                if (currentNote.pos == i)
                    noteSt += "          (  )          \n";
                else
                    noteSt += "\n";                
            }
            else
            {
                if (currentNote.pos == i)
                    noteSt += "----------(  )----------\n";
                else
                    noteSt += "------------------------\n";      
            }
        }
        return noteSt;
    }    
    
    Model()
    {
        playing = false;
        roundNum = 0;
        gamePhase = phases.open;
    }
}
