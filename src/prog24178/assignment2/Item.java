/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog24178.assignment2;

/**
 * Creates Items for Game Characters
 * @author Khang Do
 */
public class Item {
    private String name;
    private String description;
    private int value;
    
    /**
     * Creates a default item with a default name, description and value of 10
     */
    public Item(){
        name = "Treasures";
        description = "It's worth $10.";
        value = 10;
    }
    
    /**
     * Creates an item with a given name, description and value
     * @param name of item
     * @param description of item
     * @param value of item
     */
    public Item(String name, String description, int value){
        setName(name);
        setDescription(description);
        setValue(value);
    }

    /**
     * Gets name of an item
     * @return the name of an item
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name of an item
     * @param name of an item
     * @throws IllegalArgumentException if the name is a null or empty string
     */
    public void setName(String name) throws IllegalArgumentException{
        if ((name == null) || (name.trim().isEmpty())) {
            throw new IllegalArgumentException("Error: value cannot be "
                    + "the null object or the empty String");
        } else {
            this.name = name;
        }
    }

    /**
     * Gets the description of an item
     * @return the description of an item
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets a description of an item
     * @param description of an item
     * @throws IllegalArgumentException if the description is 
     * null or empty String
     */
    public void setDescription(String description) 
            throws IllegalArgumentException{
        if ((description == null) || (description.trim().isEmpty())) {
            throw new IllegalArgumentException("Error: value cannot be "
                    + "the null object or the empty String");
        } else {
            this.description = description;
        }        
    }

    /**
     * Gets the value of an item
     * @return the value of an item
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets a value of an item
     * @param value of an item
     * @throws IllegalArgumentException if the value is negative
     */
    public void setValue(int value) throws IllegalArgumentException{
        if (value < 0) {
            throw new IllegalArgumentException("Error: the value can not"
                    + "below 0");
        } else {
            this.value = value;
        }
    }
    
    /**
     * Sets a default String for TownCharacter class
     * @return a string for TownCharacter class
     */
    @Override
    public String toString(){
        String temp = "";
        temp += String.format("this is %s.%n", getName());
        temp += String.format("Description is %s.%n", getDescription());
        temp += String.format("Value is %d.%n", getValue());
        return temp;
    }
    
    /**
     * Compares 2 item
     * @param o is an object needed to compare
     * @return a true/false value of 2 object comparison
     */
    @Override
    public boolean equals(Object o){
        
        boolean TorF = false;
        if(o instanceof Item){            
            Item p = (Item)o;
            if(this.getName().equals(p.getName())){
                TorF = true;
            }
        }
        return TorF;
    }
}
