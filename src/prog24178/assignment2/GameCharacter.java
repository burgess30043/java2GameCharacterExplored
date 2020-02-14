/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog24178.assignment2;

/**
 *
 * @author Khang Do
 */
public abstract class GameCharacter {
    private String name;
    private boolean controllable;
    private double money;
    private Direction directionFacing;
    private String[] phrases;
    private Item[] inventory;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the controllable
     */
    public boolean isControllable() {
        return controllable;
    }

    /**
     * @param controllable the controllable to set
     */
    public void setControllable(boolean controllable) {
        this.controllable = controllable;
    }

    /**
     * @return the money
     */
    public double getMoney() {
        return money;
    }

    /**
     * @param money the money to set
     */
    public void setMoney(double money) {
        this.money = money;
    }

    /**
     * @return the directionFacing
     */
    public Direction getDirectionFacing() {
        return directionFacing;
    }

    /**
     * @param directionFacing the directionFacing to set
     */
    public void setDirectionFacing(Direction directionFacing) {
        this.directionFacing = directionFacing;
    }

    /**
     * @return the phrases
     */
    public String[] getPhrases() {
        return phrases;
    }

    /**
     * @param phrases the phrases to set
     */
    public void setPhrases(String[] phrases) {
        this.phrases = phrases;
    }

    /**
     * @return the inventory
     */
    public Item[] getInventory() {
        return inventory;
    }

    /**
     * @param inventory the inventory to set
     */
    public void setInventory(Item[] inventory) {
        this.inventory = inventory;
    }
    
    public Direction turnLeft(){
        Direction temp = Direction.LEFT;
        return temp;
    }
    
    public Direction turnRight(){
        Direction temp = Direction.RIGHT;
        return temp;
    }
    
    public abstract void speak();
    
    public double gainMoney(double m){
        return m;
    }
    
    public double loseMoney(double m){
        return m;
    }
    
    public void gainItem(Item i){
        
    }
    public void loseItem(Item i){
        
    }
    
    public void buyItem(Item i){
        
    }
    
    public void sellItem(Item i){
        
    }
    
    
}
