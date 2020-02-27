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
public class PlayableGameCharacter extends GameCharacter
        implements BattleStats {

    private int attackPower;
    private int defensePower;
    private int hitPoints;
    private int speed;

    public PlayableGameCharacter() {
        super();
        setControllable(true);
    }
    
    public PlayableGameCharacter
        (String name, double m, int atk, int def, int hit, int speed){
        super();
        super.setName(name);
        super.setMoney(m);
        setAttackPower(atk);
        setDefensePower(def);
        setHitPoints(hit);
        setSpeed(speed);
    }

    @Override
    public String speak() {
        String temp = String.format
        ("Hi, my name is %s. I'm a game character", super.getName());
        return temp;
    }

    @Override
    public void attack(GameCharacter g) {
        boolean loopCheck = true;
        while(loopCheck){
            if (g instanceof EnemyCharacter){
                g = (EnemyCharacter)g;
                if (attackPower > 0){
                    
                }
            } else if(g instanceof PlayableGameCharacter){
                g = (PlayableGameCharacter)g;
                
            } else loopCheck = false;
            
        }
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
