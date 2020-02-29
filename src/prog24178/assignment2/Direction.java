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
    NORTH("north"),
    SOUTH("south");
    
    public String directionName;
    
    public String getDirectionName(){
        return directionName;
    }
    
    private Direction(String name){
        directionName = name;
    }
}
