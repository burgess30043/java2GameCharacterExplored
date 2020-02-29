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
public class PlayableGameCharacter extends GameCharacter implements BattleStats {

    private int AttackPower;
    private int DefensePower;
    private int HitPoints;
    private int Speed;

    public PlayableGameCharacter() {
        super();
    }
    
       
    
    public PlayableGameCharacter(String name) {
        super(name);
    }

    public PlayableGameCharacter(String name, double money, int AttackPower, int DefensePower
            ,  int HitPoints, int Speed) {
        
        super(name,money);
        this.AttackPower = AttackPower;
        this.DefensePower = DefensePower;
        this.HitPoints = HitPoints;
        this.Speed = Speed;
        
    }
    
    
        
    @Override
    public void speak(){
        ArrayList<String> mySpeak = new ArrayList();
        mySpeak.add("Let's roll!");
        
        this.setPhrases(mySpeak);
        System.out.println(this.getPhrases().get(0));
    }
    
    @Override
    public void attack(GameCharacter g){
        System.out.println("That's what I want to say!!!");
    }
    
    @Override
    public boolean equals(Object o){
        
        boolean TorF=false;
        if(o instanceof PlayableGameCharacter){
            
            PlayableGameCharacter p = (PlayableGameCharacter)o;
            if(this.getName().equals(p.getName())){
                TorF=true;
            }
        }
        return TorF;
    }
    
    @Override
    public String toString(){
         
        String s = "";
        s+="My name is: "+this.getName()+" \n"
                +"I have $"+this.getMoney()+" \n"
                +"I have "+this.getInventory().size()+" treasures \n"
                +"My direction is now facing "
                +this.getDirectionFacing().getDirectionName()+".\n"
                +"Is this character controllable: "
                +this.isControllable();
        
        return s;
    }
    
    public int getAttackPower() {
        return AttackPower;
    }

    public void setAttackPower(int AttackPower) {
        this.AttackPower = AttackPower;
    }

    public int getDefensePower() {
        return DefensePower;
    }

    public void setDefensePower(int DefensePower) {
        this.DefensePower = DefensePower;
    }

    public int getHitPoints() {
        return HitPoints;
    }

    public void setHitPoints(int HitPoints) {
        this.HitPoints = HitPoints;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int Speed) {
        this.Speed = Speed;
    }
}
