/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mark_5;


class Round {
    public int roundNum;
    public Note note;
    public String userGuess;
    
    Round(int roundNum, String lastUserGuess)
    {
        this.roundNum = roundNum;
        this.note = getRandomNote();
        this.userGuess = lastUserGuess;
    }

    /**
     * Compares the current round's note with the user guess
     * @param currentNote the current note on the round
     * (?) Why not use the own field of the class instead of
     *     passing a param. ?
     * @param userGuess the guess selected on the list by the user
     * @return true if the user got it right, false otherwise
     */
    static boolean checkUserGuess(Note currentNote, String userGuess)
    {
        String cleanNote = currentNote.name.substring(0, 1).toUpperCase();
        if(cleanNote.equals(userGuess.toUpperCase()))
            return true;
        else
            return false;
    }
    
    /**
     * Selects a note randomly in an Array
     * (?) Should this be in the class "Note" ?
     * @return a random note to be used in the current round
     */
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
