/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog24178.assignment2;

/**
 * Direction of game character
 * @author Khang Do
 */
public enum Direction {
    LEFT("left"),
    RIGHT("right"),
    NORTH("north"),
    SOUTH("south");
    
    /**
     * direction name
     */
    public String directionName;
    
    /**
     * Gets direction name
     * @return direction
     */
    public String getDirectionName(){
        return directionName;
    }
    
    private Direction(String name){
        directionName = name;
    }
}
