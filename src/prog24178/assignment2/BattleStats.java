/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog24178.assignment2;

/**
 * Creates battle stats for PlayableGameCharacter & EnemyCharacter
 * @author Khang Do
 */
public interface BattleStats {
    
    public static final int ATTACKPOWER = 30; //default attack power of 30
    public static final int DEFENSEPOWER = 5; //default defense power of 5
    public static final int HITPOINTS = 100; //default hit points of 100
    public static final int SPEED = 5; //default speed of 5
   
    /**
     * Attacks other game character
     * @param g is a game character
     */
    public abstract void attack (GameCharacter g);
}
