/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mark_5;

import java.awt.Image;
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
     * Método informa onde será posicionada a imagem da "whole-note" no staff
     * o método usa a posição da nota no array e a multiplica por um fator
     * para posicioná-la no lugar adequado
     * Assim, não é preciso assinalar manualmente a posição para cada nota
    */
    public void setNoteLoc()
    {
        noteLoc = new Point(100, (110-(12*pos)));
    }
    
    /**
     * Retorna a loc. da nota como um "Point" (x, y)
     * @return 
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
     * Basicamente inicializa um ArrayList de String[s]
     * convertendo um Array em ArrayList
     * @return 
     */
    public static ArrayList<String> fillArray()
    {
        String[] notesArray = {"D","E","F","G","A","B","C","Dh","Eh","Fh","Gh"};
        ArrayList<String> array = new ArrayList();
        array.addAll(Arrays.asList(notesArray));
        return array;
    }
}
