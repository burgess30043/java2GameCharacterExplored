/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuohsi;

/**
 *
 * @author burge
 */
public abstract class NonPlayableGameCharacter extends GameCharacter {

    public NonPlayableGameCharacter(String name) {
        super(name);
    }
    
    public NonPlayableGameCharacter(String name, double money) {
        super(name, money);
    }
    
}
