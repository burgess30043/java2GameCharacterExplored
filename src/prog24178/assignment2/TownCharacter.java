/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog24178.assignment2;

/**
 * Creates a town character for the game
 * @author Khang Do
 */
public class TownCharacter extends NonPlayableGameCharacter {
    
    /**
     * Create a default Town character
     */
    public TownCharacter(){
        super();
    }
    
    /**
     * Creates a town character with a given name
     * @param name of town character
     */
    public TownCharacter(String name){
        super.setName(name);
    }
    
    /**
     * Speaks to another game character
     * @return a string of town character speak
     */
    @Override
    public String speak(){
        String temp = String.format
        ("Hi, I'm %s. I'm a non-playable character. "
                + "I live in this town.", super.getName());
        return temp;
    }
    
    /**
     * Sets a default String for TownCharacter class
     * @return a string for TownCharacter class
     */
    @Override
    public String toString(){
        String temp = "";
        temp += String.format("My name is %s.%n", super.getName());        
        return temp;
    }
    
    /**
     * Compares 2 Town character
     * @param o is an object needed to compare
     * @return a true/false value of 2 object comparison
     */
    @Override
    public boolean equals(Object o){
        
        boolean TorF = false;
        if(o instanceof TownCharacter){            
            TownCharacter p = (TownCharacter)o;
            if(this.getName().equals(p.getName())){
                TorF = true;
            }
        }
        return TorF;
    }
}
