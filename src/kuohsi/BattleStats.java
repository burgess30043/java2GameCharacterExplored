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
public interface BattleStats {
    
    public static final int ATTACKPOWER = 30;
    public static final int DEFENSEPOWER = 5;
    public static final int HITPOINTS = 100;
    public static final int SPEED = 5;
    
    public abstract void attack(GameCharacter g);
}
