/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog24178.assignment2;

/**
 * Creates a non-playable game character with the default false of controllable
 * data member
 * @author Khang Do
 */
public abstract class NonPlayableGameCharacter extends GameCharacter{
    private boolean controllable = false; //Default un-controllable

    /**
     * Gets the controllable value of game character
     * @return the controllable of game character
     */
    public boolean isControllable() {
        return controllable;
    }

    /**
     * Sets the controllable value of game character
     * @param controllable the controllable to set
     */
    public void setControllable(boolean controllable) {
        this.controllable = controllable;
    }
}
