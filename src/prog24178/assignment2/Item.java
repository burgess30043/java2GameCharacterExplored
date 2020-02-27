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
    
    public Item(){
        
    }
    
    public Item(String name, String description, int value){
        setName(name);
        
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
        if ((name == null) || (name.trim().isEmpty())) {
            throw new IllegalArgumentException("Error: value cannot be "
                    + "the null object or the empty String");
        } else {
            this.name = name;
        }
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        if ((description == null) || (description.trim().isEmpty())) {
            throw new IllegalArgumentException("Error: value cannot be "
                    + "the null object or the empty String");
        } else {
            this.description = description;
        }        
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
}
