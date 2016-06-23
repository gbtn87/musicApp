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
    static ArrayList<String> notes = fillArray();
    String name;
    int pos;
    Image image;
    Point noteLoc;
    
    /**Método informa onde será posicionada a imagem da "whole-note" no staff
     * o método usa a posição da nota no array e a multiplica por um fator
     * para posicioná-la no lugar adequado
     * Assim, não é preciso assinalar manualmente a posição para cada nota
    */
    public void setNoteLoc()
    {
        for(String noteName : notes)
        {
            if (noteName.toUpperCase().equals(name.toUpperCase())) 
            {
                noteLoc = new Point(100, (110-(12*pos)));
            }
        }
    }
    
    /**
     * Retorna a loc. da nota como um "Point" (x, y)
     * @return 
     */
    public Point getNoteLoc()
    {
        return noteLoc;
    }
    
    /**
     * Construtor: toda vez que eu criar uma nova nota, ele executa esses passos
     * @param note 
     */
    Note(String note)
    {
        name = note;
        pos = notes.indexOf(name);
        setNoteLoc();
    }
    
    public static ArrayList<String> fillArray()
    {
        String[] notesA = {"D","E","F","G","A","B","C","Dh","Eh","Fh","Gh"};
        ArrayList<String> array = new ArrayList<String>();
        for (int i = 0; i < notesA.length; i++) {
            array.add(notesA[i]);
        }
        return array;
    }
}
