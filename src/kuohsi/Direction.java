/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuohsi;

/**
 *
 * @author burgess
 */
public enum Direction {
    
    NORTH("north"),
    SOUTH("south"),
    LEFT("left"),
    RIGHT("right");
    
    public String directionName;
    
    private Direction(String name){
        directionName = name;
    }
    
    public String getDirectionName(){
        return directionName;
    }
    
    public static void main(String[] args){
        Direction d = Direction.LEFT;
        System.out.println(d);
        System.out.println(d.getDirectionName());
    } 
}
