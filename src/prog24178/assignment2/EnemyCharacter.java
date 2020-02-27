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
public class EnemyCharacter extends NonPlayableGameCharacter 
        implements BattleStats{
    private int attackPower;
    private int defensePower;
    private int hitPoints;
    private int speed;
    
    public EnemyCharacter(){
        super();
    }
    
    @Override
    public String speak(){
        String temp = String.format
        ("Hi, I'm %s. I'm a non-playable character. "
                + "I'm your enemy.", super.getName());
        return temp;
    }
    
    @Override
    public void attack(GameCharacter g){
        
    }
    
    /**
     * @return the attackPower
     */
    public int getAttackPower() {
        return attackPower;
    }

    /**
     * @param attackPower the attackPower to set
     */
    public void setAttackPower(int attackPower) throws 
            IllegalArgumentException{
        if (attackPower > 0) {
            this.attackPower = attackPower;
        } else throw new IllegalArgumentException
        ("Error: value must be positive");
    }

    /**
     * @return the defensePower
     */
    public int getDefensePower() {
        return defensePower;
    }

    /**
     * @param defensePower the defensePower to set
     */
    public void setDefensePower(int defensePower) throws 
            IllegalArgumentException{
        if (defensePower > 0) {
            this.defensePower = defensePower;
        } else throw new IllegalArgumentException
        ("Error: value must be positive");        
    }

    /**
     * @return the hitPoints
     */
    public int getHitPoints() {
        return hitPoints;
    }

    /**
     * @param hitPoints the hitPoints to set
     */
    public void setHitPoints(int hitPoints) throws IllegalArgumentException{
        if (hitPoints > 0) {
            this.hitPoints = hitPoints;
        } else throw new IllegalArgumentException
        ("Error: value must be positive");        
    }

    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) throws IllegalArgumentException{
        if (speed > 0) {
            this.speed = speed;
        } else throw new IllegalArgumentException
        ("Error: value must be positive");
    }
}
