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
    
    public TownCharacter(){
        super();
    }
    
    public TownCharacter(String name){
        super.setName(name);
    }
    
    @Override
    public String speak(){
        String temp = String.format
        ("Hi, I'm %s. I'm a non-playable character. "
                + "I live in this town.", super.getName());
        return temp;
    }
}
