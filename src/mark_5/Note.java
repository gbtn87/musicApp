/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mark_5;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Gustavo
 */
final class Note
{    
    public static ArrayList<String> notes = fillArray();
    public String name;
    public int pos;
    public Point noteLoc;
    
    /**
     * Method informs where the "whole-note" image will be positioned at on the staff
     * The method uses the note's position on the array and multiplies it by a 
     * constant
     * This way, there is no need to manually assign the position for every note
    */
    
    public void setNoteLoc()
    {
        noteLoc = new Point(100, (110-(12*pos)));
    }
    
    /**
     * @return the note's location as a "x-y Point"
     */
    public Point getNoteLoc()
    {
        return noteLoc;
    }
    
    Note(String note)
    {
        name = note;
        pos = notes.indexOf(name);
        setNoteLoc();
    }
    
    /**
     * Initiallizes a ArrayList of String by
     * converting an Array into an ArrayList
//     * @return ArrayList<String> the ArrayList that contains the notes' names 
     */
    public static ArrayList<String> fillArray()
    {
        String[] notesArray = {"D","E","F","G","A","B","C","Dh","Eh","Fh","Gh"};
        ArrayList<String> array = new ArrayList();
        array.addAll(Arrays.asList(notesArray));
        return array;
    }
}
