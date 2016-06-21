/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mark_5;

import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
class Note
{    
    static ArrayList<String> notes = new ArrayList();
    String name;
    int pos;
    Image image;
    Point noteLoc;
    
    public void setNoteLoc()
    {
        for(String noteName : notes)
        {
            if (noteName.toUpperCase().equals(name.toUpperCase())) 
            {
                int fatorPos = notes.indexOf(noteName);
                noteLoc = new Point(100, (110-(12*fatorPos)));
            }
        }
    }
    
    public Point getNoteLoc()
    {
        return noteLoc;
    }
    Note(String note)
    {        
        notes = fillArray();
        name = note;
        pos = notes.indexOf(name);
        setNoteLoc();
    }
    
    public ArrayList<String> fillArray()
    {
        String[] notesA = {"D","E","F","G","A","B","C","Dh","Eh","Fh","Gh"};
        ArrayList<String> array = new ArrayList<String>();
        for (int i = 0; i < notesA.length; i++) {
            array.add(notesA[i]);
        }
        return array;
    }
}
