/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mark_5;

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
    private int roundNum;
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
    
    //Pode ficar aqui
    public static String Welcome()
    {
        return ("Welcome to the game! "
                + "\nLet's begin!"
                + " Press Start\n");
    }
    
    Model()
    {
        //Isso deve ir para a classe Session
        roundNum = 0;
        //A fase do jogo pode ficar aqui, pois ela estará vendo a session de cima e mudando seu estado de acordo
        gamePhase = phases.wait;
    }
}
