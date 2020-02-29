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
public class EnemyCharacter extends NonPlayableGameCharacter 
        implements BattleStats {
    
    public EnemyCharacter(String name, double money){
        super(name, money);
    }
    
    @Override
    public void speak(){
        
        ArrayList<String> EnemySpeak = new ArrayList();
        EnemySpeak.add("Let's fight!");
        
        this.setPhrases(EnemySpeak);
        System.out.println(this.getPhrases().get(0));
    }
    
    @Override
    public void attack(GameCharacter g){
        System.out.println("I will kill you!!!");
    }
    
    @Override
    public boolean equals(Object o){
        
        boolean TorF=false;
        
        if(o instanceof EnemyCharacter){
            EnemyCharacter e = (EnemyCharacter)o;
            int SPEED1 = EnemyCharacter.SPEED;
            
            if(this.getName().equals(e.getName())){
                TorF=true;
            }
        }
        return TorF;
    }
    
    @Override
    public String toString(){
         
        String s = "";
        s+="The enemy's name is: "+this.getName()+". "
            +"\nThe enemy can be controlled? "+this.isControllable();
        
        return s;
    }
}
