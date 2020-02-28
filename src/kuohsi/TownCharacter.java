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
public class TownCharacter extends NonPlayableGameCharacter {

    public TownCharacter(String name) {
        super(name);
    }
    
    @Override
    public void speak(){
        ArrayList<String> townSpeak = new ArrayList();
        townSpeak.add("Hi!");
        
        this.setPhrases(townSpeak);
        System.out.println(this.getPhrases().get(0));
    }
    
    @Override
    public boolean equals(Object o){
        
        boolean TorF=false;
        if(o instanceof TownCharacter){
            TownCharacter t = (TownCharacter)o;
            
            if(this.getName().equals(t.getName())){
                TorF=true;
            }
        }
        return TorF;
    }
    
    @Override
    public String toString(){
         
        String s = "";
        s+="The kind man's name is: "+this.getName()+". "
            +"\nThe town man can be controlled? "+this.isControllable();
        return s;
    }
    
}
