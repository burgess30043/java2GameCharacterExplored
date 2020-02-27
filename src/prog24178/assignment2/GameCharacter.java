/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog24178.assignment2;

import java.util.ArrayList;

/**
 *
 * @author Khang Do
 */
public abstract class GameCharacter {

    private String name;
    private boolean controllable;
    private double money;
    private Direction directionFacing;
    private ArrayList<String> phrases;
    private ArrayList<Item> inventory;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
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
    public void setMoney(double money) throws IllegalArgumentException {
        if (money < 0) {
            throw new IllegalArgumentException("Error: the value can not"
                    + "below 0");
        } else {
            this.money = money;
        }
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
     * @return the phrases
     */
    public ArrayList<String> getPhrases() {
        return phrases;
    }

    /**
     * @param phrases the phrases to set
     */
    public void setPhrases(ArrayList<String> phrases) {
        if ((phrases == null) || (phrases.isEmpty())) {
            throw new IllegalArgumentException("Error: value cannot be "
                    + "the null object or the empty String");
        } else {
            this.phrases = phrases;
        }        
    }

    /**
     * @return the inventory
     */
    public ArrayList<Item> getInventory() {
        return inventory;
    }

    /**
     * @param inventory the inventory to set
     */
    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public Direction turnLeft() {
        Direction temp = Direction.LEFT;
        return temp;
    }

    public Direction turnRight() {
        Direction temp = Direction.RIGHT;
        return temp;
    }

    public abstract String speak();

    public double gainMoney(double m) throws IllegalArgumentException {
        if (m > 0) {
            money += m;
        } else {
            throw new 
        IllegalArgumentException("Error: The amount of money must be positive");
        }
        return money;
    }

    public double loseMoney(double m) {
        if (m > 0) {
            money -= m;
        } else {
            throw new 
        IllegalArgumentException("Error: The amount of money must be positive");
        }
        return money;
    }

    public void gainItem(Item i) {
        inventory.add(i);
    }

    public void loseItem(Item i) throws IllegalArgumentException{
        if (inventory.indexOf(i) == -1){
            throw new IllegalArgumentException
        ("Error: The item is in your invetory.");
        } else inventory.remove(i);
    }

    public void buyItem(Item i) {
        inventory.add(i);
    }

    public void sellItem(Item i) {
        if (inventory.indexOf(i) == -1){
            throw new IllegalArgumentException
        ("Error: The item is in your invetory.");
        } else inventory.remove(i);
    }
}
