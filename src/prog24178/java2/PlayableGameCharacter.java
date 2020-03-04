/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog24178.java2;

/**
 * Creates an user's game character
 * @author Khang Do
 */
public class PlayableGameCharacter extends GameCharacter
        implements BattleStats {

    private int attackPower;
    private int defensePower;
    private int hitPoints;
    private int speed;
    
    /**
     * Creates a default constructor for PlayableGameCharacter class
     */
    public PlayableGameCharacter() {
        super();
        setControllable(true);
    }
    
    /**
     * Creates a constructor for a PlayableGameCharacter with a given name
     * @param name of game character
     */
    public PlayableGameCharacter(String name){
        super.setName(name);
        setControllable(true);
    }

    /**
     * Creates a constructor of a PlayableGameCharacter with a given name
     * amount of money, attack, defense, hit points and speed level.
     * @param name of character
     * @param m is amount of money of game character
     * @param atk is attack power of game character
     * @param def is defense power of game character
     * @param hit is hit points of game character
     * @param speed is speed of game character
     */
    public PlayableGameCharacter
        (String name, double m, int atk, int def, int hit, int speed) {
        super();
        super.setName(name);
        super.setMoney(m);
        setControllable(true);
        setAttackPower(atk);
        setDefensePower(def);
        setHitPoints(hit);
        setSpeed(speed);
    }

    /**
     * Create a default speak of game character
     * @return a String of game character speak
     */
    @Override
    public String speak() {
        String temp = String.format("Hi, my name is %s. "
                + "I'm a game character.%n", super.getName());
        return temp;
    }
    
    /**
     * Attacks other game character
     * @param g is a game character
     * @throws IllegalArgumentException if the game character is not a
     * controllable character
     */
    @Override
    public void attack(GameCharacter g) throws IllegalArgumentException{        
            if (g instanceof EnemyCharacter) {
                if (hitPoints > 0 && ((EnemyCharacter)g).getHitPoints() > 0) {
                    if (attackPower > ((EnemyCharacter)g).getDefensePower()) {
                        ((EnemyCharacter)g).setHitPoints(attackPower - 
                                ((EnemyCharacter)g).getDefensePower());
                        System.out.printf("%s attacks %s, "
                                + "%s loses %d hit points%n", getName(), 
                                g.getName(), g.getName(), (attackPower - 
                                ((EnemyCharacter)g).getDefensePower()));
                    } else System.out.printf("%s attacks %s, "
                                + "%s loses 0 hit points%n", getName(), 
                                g.getName(), g.getName());
                }
            } else if (g instanceof PlayableGameCharacter) {
                if (hitPoints > 0 && 
                        ((PlayableGameCharacter)g).getHitPoints() > 0) {
                    if (attackPower > 
                            ((PlayableGameCharacter)g).getDefensePower()) {
                        ((PlayableGameCharacter)g).setHitPoints(attackPower - 
                                ((PlayableGameCharacter)g).getDefensePower());
                        System.out.printf("%s attacks %s, "
                                + "%s loses %d hit points%n", getName(), 
                                g.getName(), g.getName(), (attackPower - 
                                ((PlayableGameCharacter)g).getDefensePower()));
                    } else System.out.printf("%s attacks %s, "
                                + "%s loses 0 hit points%n", getName(), 
                                g.getName(), g.getName());
                }
            } else throw new 
        IllegalArgumentException("Error: The character is unable to attack.");
        }
    

    /**
     * Gets the attack power of game character
     * @return the attackPower of game character
     */
    public int getAttackPower() {
        return attackPower;
    }

    /**
     * Sets the attack power of game character
     * @param attackPower of game character
     * @throws IllegalArgumentException if the attack power is negative value
     */
    public void setAttackPower(int attackPower) throws
            IllegalArgumentException {
        if (attackPower > 0) {
            this.attackPower = attackPower;
        } else {
            throw new IllegalArgumentException("Error: value must be positive");
        }
    }

    /**
     * Gets the defense power of game character
     * @return the defensePower of game character
     */
    public int getDefensePower() {
        return defensePower;
    }

    /**
     * Sets the defense power of game character
     * @param defensePower of game character
     * @throws IllegalArgumentException if the defense power is negative value
     */
    public void setDefensePower(int defensePower) throws
            IllegalArgumentException {
        if (defensePower > 0) {
            this.defensePower = defensePower;
        } else {
            throw new IllegalArgumentException("Error: value must be positive");
        }
    }

    /**
     * Gets the hit points of game character
     * @return the hitPoints of game character
     */
    public int getHitPoints() {
        return hitPoints;
    }

    /**
     * Sets the hit points of game character
     * @param hitPoints of game character
     * @throws IllegalArgumentException if the hit points is negative value
     */
    public void setHitPoints(int hitPoints) throws IllegalArgumentException {
        if (hitPoints > 0) {
            this.hitPoints = hitPoints;
        } else {
            throw new IllegalArgumentException("Error: value must be positive");
        }
    }

    /**
     * Gets the speed of game character
     * @return the speed of game character
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the speed of game character
     * @param speed the speed to set
     * @throws IllegalArgumentException if the speed is negative value
     */
    public void setSpeed(int speed) throws IllegalArgumentException {
        if (speed > 0) {
            this.speed = speed;
        } else {
            throw new IllegalArgumentException("Error: value must be positive");
        }
    }
    
    /**
     * Sets a default String for PlayableGameCharacter class
     * @return a string for PlayableGameCharacter class
     */
    @Override
    public String toString(){
        String temp = "";
        temp += String.format("My name is %s.%n", super.getName());
        temp += String.format("My available money is %4.2f.%n", super.getMoney());
        temp += String.format("My battle stat:%n");
        temp += String.format("Attack power: %d.%n", attackPower);
        temp += String.format("Defense power: %d.%n", defensePower);
        temp += String.format("Hit points: %d.%n", hitPoints);
        temp += String.format("Speed: %d.%n", speed);
        return temp;
    }
    
    /**
     * Compares 2 PlayableGameCharacter 
     * @param o is an object needed to compare
     * @return a true/false value of 2 object comparison
     */
    @Override
    public boolean equals(Object o){
        
        boolean TorF = false;
        if(o instanceof PlayableGameCharacter){            
            PlayableGameCharacter p = (PlayableGameCharacter)o;
            if(this.getName().equals(p.getName())){
                TorF = true;
            }
        }
        return TorF;
    }
}
