/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuohsi;

import java.util.ArrayList;
/**
 *
 * @author burge
 */
public abstract class GameCharacter {

    private String name;    
    private boolean controllable = true;
    private double money;
    private Direction directionFacing;
    private ArrayList<String> phrases = new ArrayList();
    private ArrayList<Item> inventory = new ArrayList();

    public GameCharacter() {
    }
    
    public GameCharacter(String name) {
        this.setName(name);
    }
    
    public GameCharacter(String name, double money) {
        this.setName(name);
        this.setMoney(money);
    }
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
    public ArrayList<String> getPhrases() {
        return phrases;
    }
    
    /**
     * @param phrases the phrases to set
     */
    public void setPhrases(ArrayList<String> phrases) {
        this.phrases = phrases;
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
        this.money+=m;
        return this.money;
    }
    
    public double loseMoney(double m){
        if(this.money>m){
            this.money-=m;
        }
        else{
            this.setMoney(0);
        }
        return this.money;
    }
    
    public void gainItem(Item i){
        inventory.add(i);
    }
    
    public void loseItem(Item i){
        if(inventory.size()>0){
            inventory.remove(i);
        }
        else{
            System.out.println("Sorry! You have no items now.");
        }
    }
    
    public void buyItem(Item i){
        inventory.add(i);
    }
    
    public void sellItem(Item i){
        if(inventory.size()>0){
            inventory.remove(i);
        }
        else{
            System.out.println("Sorry! You have nothing to sell now.");
        }
    }
    
    
}
