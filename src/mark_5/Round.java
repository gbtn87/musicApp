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
class Round {
    int roundNum;
    Note note;
    String userGuess = "";
    
    Round(int roundNum)
    {
        this.roundNum = roundNum;
        note = getRandomNote();
    }

    static boolean checkNotes(Note currentNote, String input)
    {
        String cleanNote = currentNote.name.substring(0, 1).toUpperCase();
        if(cleanNote.equals(input.toUpperCase()))
            return true;
        else
            return false;
    }
    
    static Note getRandomNote()
    {
        String[] notesA = {"D","E","F","G","A","B","C","Dh","Eh","Fh","Gh"};
        Note tempNote;
        int randomNum = (int)(Math.random() * 11);
        String noteName = notesA[randomNum];
        tempNote = new Note(noteName);
        return tempNote;
    }
    
}
