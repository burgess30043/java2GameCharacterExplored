/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog24178.java2;

import java.util.ArrayList;

/**
 * Creates a parent class for class PlayableGameCharacter, EnemyCharacter,
 * and TownCharacter
 * @author Khang Do
 */
public abstract class GameCharacter {

    private String name;
    private boolean controllable;
    private double money;
    private Direction directionFacing;
    private ArrayList<String> phrases = new ArrayList();
    private ArrayList<Item> inventory = new ArrayList();

    /**
     * Gets the name of game character
     * @return the name of the game character
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of game character
     * @param name of game character
     * @throws IllegalArgumentException if the name is a null or empty string
     */
    public void setName(String name) throws IllegalArgumentException {
        if ((name == null) || (name.trim().isEmpty())) {
            throw new IllegalArgumentException("Error: value cannot be "
                    + "the null object or the empty String");
        } else {
            this.name = name;
        }
    }

    /**
     * Gets the controllable value of game character
     * @return the controllable of game character
     */
    public boolean isControllable() {
        return controllable;
    }

    /**
     * Sets controllable element of game character
     * @param controllable the controllable to set
     */
    public void setControllable(boolean controllable) {
        this.controllable = controllable;
    }

    /**
     * Gets the amount of money of game character
     * @return the amount of money of game character
     */
    public double getMoney() {
        return money;
    }

    /**
     * Sets the amount of money of game character
     * @param money of game character
     * @throws IllegalArgumentException if the amount of money is a negative
     * value
     */
    public void setMoney(double money) throws IllegalArgumentException {
        if (money < 0) {
            throw new IllegalArgumentException("Error: the value can not"
                    + "below 0");
        } else {
            this.money = money;
        }
    }

    /**
     * Gets the direction of game character
     * @return the directionFacing of game character
     */
    public Direction getDirectionFacing() {
        return directionFacing;
    }

    /**
     * Sets the direction of game character
     * @param directionFacing of game character
     * @throws IllegalArgumentException if the direction is not in the list
     * of direction
     */
    public void setDirectionFacing(Direction directionFacing) 
            throws IllegalArgumentException{
        boolean checkDirection = false;
        Direction[] dir = Direction.values();
        for (Direction dirCheck : dir) {
            if (dirCheck.equals(directionFacing)) {
                checkDirection = true;
            }
        }
        if (checkDirection) {
            this.directionFacing = directionFacing;
        } else throw new IllegalArgumentException
        ("Error: The direction must be left, right or forward");
    }

    /**
     * Gets the phrase of the game
     * @return the phrases of the game
     */
    public ArrayList<String> getPhrases() {
        return phrases;
    }

    /**
     * Sets the phrase of the game
     * @param phrases of the game
     * @throws IllegalArgumentException if the phrase is 
     * a null or an empty String
     */
    public void setPhrases(ArrayList<String> phrases) 
            throws IllegalArgumentException{
        if ((phrases == null) || (phrases.isEmpty())) {
            throw new IllegalArgumentException("Error: value cannot be "
                    + "the null object or the empty String");
        } else {
            this.phrases = phrases;
        }        
    }

    /**
     * Gets the inventory of game character
     * @return the list of items in the inventory
     */
    public ArrayList<Item> getInventory() {
        return inventory;
    }

    /**
     * Sets the list of items in the inventory
     * @param inventory of game character
     */
    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }
    /**
     * Turns the direction to left
     * @return direction of game character to left
     */
    public Direction turnLeft() {
        Direction temp = Direction.LEFT;
        return temp;
    }
    
    /**
     * Turns the direction to right
     * @return direction of game character to right
     */
    public Direction turnRight() {
        Direction temp = Direction.RIGHT;
        return temp;
    }
    
    /**
     * Game Character can speak
     * @return a String of game character speaking
     */
    public abstract String speak();
    
    /**
     * Gains an amount of money of game character
     * @param m is the amount of gaining money
     * @return the amount of money after gaining
     * @throws IllegalArgumentException if the value of money is negative
     */
    public double gainMoney(double m) throws IllegalArgumentException {
        if (m > 0) {
            money += m;
        } else {
            throw new 
        IllegalArgumentException("Error: The amount of money must be positive");
        }
        return money;
    }
    
    /**
     * Loses an amount of money of game character
     * @param m is the amount of losing money
     * @return the amount of money after losing
     * @throws IllegalArgumentException if the value of money is negative
     */
    public double loseMoney(double m) throws IllegalArgumentException{
        if (m > 0) {
            money -= m;
        } else {
            throw new 
        IllegalArgumentException("Error: The amount of money must be positive");
        }
        return money;
    }
    
    /**
     * Gains an item for game character
     * @param i is an item that game character gains
     */
    public void gainItem(Item i) {
        inventory.add(i);
    }
    
    /**
     * Loses an item in the game character inventory
     * @param i is an item that game character loses
     * @throws IllegalArgumentException if the item is not in the inventory
     */
    public void loseItem(Item i) throws IllegalArgumentException{
        if (inventory.indexOf(i) == -1){
            throw new IllegalArgumentException
        ("Error: The item is in your invetory.");
        } else inventory.remove(i);
    }
    
    /**
     * Buys new item
     * @param i is an item that game character buys
     */
    public void buyItem(Item i) {
        inventory.add(i);
    }
    
    /**
     * Sells an item in game character inventory
     * @param i is an item that game character sells
     * @throws IllegalArgumentException if the item is not in the inventory
     */
    public void sellItem(Item i) throws IllegalArgumentException{
        if (inventory.indexOf(i) == -1){
            throw new IllegalArgumentException
        ("Error: The item is in your invetory.");
        } else inventory.remove(i);
    }
}
