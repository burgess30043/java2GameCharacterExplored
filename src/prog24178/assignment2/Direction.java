/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog24178.assignment2;

/**
 *
 * @author Admin
 */
public enum Direction {
    LEFT("left"),
    RIGHT("right"),
    FORWARD("forward");
    
    public String displayName;
    
    public String getDisplayName(){
        return displayName;
    }
    
    private Direction(String name){
        displayName = name;
    }
}
