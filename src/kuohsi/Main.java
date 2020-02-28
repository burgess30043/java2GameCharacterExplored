/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuohsi;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import errorCheck.JavaErrorCheck;
/**
 *
 * @author burge
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        greeting();
        missionStart(mkCharacter());
    }
    
    public static void greeting() {
        
        String s = "";
        s+= "Welcome to Burgess adventure kingdom, you will face a lot of "
                +"challenges, but no worries too much because I will help you! "
                + "\nWish you the best luck!";
                
        System.out.println(s);
        System.out.println("---------------------------------------------------"
            +"---------------------------------------------------"
            +"---------------------------------------------------");
    }
    
    public static PlayableGameCharacter mkCharacter(){
        
        JavaErrorCheck jec = new JavaErrorCheck();
        Random ran = new Random();
        Scanner input = new Scanner(System.in);

        String vaildForMc, myName, vaildForAV;
        
        do{
            System.out.println("Now, Let's create you own character! Please "+
                "enter your name > ");
            myName = jec.checkEnterOfString(input);
            System.out.println("Your name is: "+myName+". enter Y/N to confirm."
                    + " (Y for yes, N for enter again) > ");
            vaildForMc = jec.checkYorN(input);
            
        }while(vaildForMc.equals("n")||vaildForMc.equals("N"));
        PlayableGameCharacter myCharacter = new PlayableGameCharacter(myName);
        
        System.out.println("Do you want to set up your character's ability "
                +"value? (Y for yes, N for no) > ");
        vaildForAV = jec.checkYorN(input);
        
        int attackP=0, DefenseP=0, HitP=0, speed=0;
        
        if(vaildForAV.equals("n")||vaildForAV.equals("N")){
            attackP = ran.nextInt(11)+10;
            DefenseP = ran.nextInt(11)+10;
            HitP = ran.nextInt(101)+100;
            speed = ran.nextInt(5)+1;
        }
        else{
            System.out.println("Please enter your STR (Strength needs to be "
                    +"between 10 to 20 > ");
            attackP=jec.checkIntTenTwenty(input);
            System.out.println("Your STR is "+attackP);
            
            System.out.println("Please enter your DEF (Defense needs to be "
                    +"between 10 to 20 > ");
            DefenseP=jec.checkIntTenTwenty(input);
            System.out.println("Your STR is "+DefenseP);
            
            System.out.println("Please enter your HP (Health points needs to "
                    +"be between 100 to 200 > ");
            HitP=jec.checkIntOneHtoTwoH(input);
            System.out.println("Your STR is "+HitP);
            
            System.out.println("Please enter your SP (Speed needs to be "
                    +"between 1 to 5 > ");
            speed=jec.checkIntSpeed(input);
            System.out.println("Your STR is "+speed);
            
        }
        
        myCharacter.setAttackPower(attackP);
        myCharacter.setDefensePower(DefenseP);
        myCharacter.setHitPoints(HitP);
        myCharacter.setSpeed(speed);
        
        String s = "";
        s+=myCharacter.getName()+"'s STR is "+myCharacter.getAttackPower()
            +".\nDEF is "+myCharacter.getDefensePower()+".\nHP is "
            +myCharacter.getHitPoints()+".\nSP is "+myCharacter.getSpeed()+".";
        System.out.println("Now your ability is... \n"+s);
        
        System.out.println("---------------------------------------------------"
             +"---------------------------------------------------"
            +"---------------------------------------------------");
             
        System.out.println("Hello again, my name is Burgess! In order to "
            +"welcome you, I want to give you some treasures and money "
            +"help you bring pease to our town!");
        System.out.println("You will complete the mission in two ways, one "
            +"is you got $1000 dollars and submit it to me to help us. \nThe "
            +"other way is you have no money and then you will have to leave "
            +"my town. \nGood luck! My friend.");
        System.out.println("\nDing-ding! You got something in your backpeck!");
        
        for (int i = 0; i < 3; i++) {
            myCharacter.gainItem(
                    new Item("Treasures","King Burgess' treasures!",10));
        }
        
        myCharacter.gainMoney(100);
        
        int facing = ran.nextInt(2);
        switch(facing){
            case 0:
                myCharacter.setDirectionFacing(Direction.NORTH);
                break;
            case 1:
                myCharacter.setDirectionFacing(Direction.SOUTH);
                break;                
        }
        
        System.out.println("---------------------------------------------------"
             +"---------------------------------------------------"
            +"---------------------------------------------------");
        System.out.println(myCharacter);
        
        return myCharacter;
        
    }
    
    public static void villagerHi(){
        
        JavaErrorCheck jec = new JavaErrorCheck();
        Random ran = new Random();
        Scanner input = new Scanner(System.in);
        
        String villagerName [] = {"Amelia","Olivia","Isla","Emily","Ava"
                ,"Oliver","Jack","Harry","Charlie","Thomas"};
        int nameIndex = ran.nextInt(10);
        TownCharacter newVillager = new TownCharacter(villagerName[nameIndex]);
        
        System.out.println("Suddenly, you bump into "+newVillager.getName());
        newVillager.speak();
        System.out.print("says "+newVillager.getName()+". ");
        System.out.println();
        newVillager.gainItem(new Item("Someone's stuff", "It is not belong to you"
                                ,1));
        
        int chance = ran.nextInt(2);
        String YorN = "";
        boolean steal;
        if(chance==0){
            System.out.println("Suddenly, you want to do something...");
            System.out.println("Do you want to steal something from "
                +newVillager.getName()+"?(Y for yes/N for no)");
            YorN = jec.checkYorN(input);
            YorN = YorN.toLowerCase();
            
            if(YorN.equals("y")){
                steal = stealItem(newVillager
                        ,newVillager.getInventory().get(0));
                if(steal==true){
                System.out.println("Your steal skill imporove!");
                }
                else System.out.println("Your guilty +10.");
            }
        }   
    }
    
    public static boolean stealItem(GameCharacter g, Item i){
        Random ran = new Random();
        
        TownCharacter t = new TownCharacter("Nobody");
        if(g instanceof TownCharacter){
            t = (TownCharacter)g;
        }
        
        System.out.println("You are trying to steal item from "+t.getName()
            +"...");
        
        int chance = ran.nextInt(2);
        boolean result = false;
        switch(chance){
            case 0:
                System.out.println("You success!");
                System.out.println("You got a item named "+i.getName()+".\n"
                    +"The desription is "+i.getDescription()+".");
                System.out.println("You feel guilty so that you return the "
                        +"item!");
                result = true;
                break;
            case 1:
                System.out.println("You fail!");
                System.out.println("Your run away and feel very guilty.");
                result = false;
                break;
        }
        return result;
    }
    
    public static EnemyCharacter mkEnemy(){
        
        Random ran = new Random();      
        String enemyName [] = {"Ninga George","Robber Oscar","Pitate James"
                ,"Brigand William","Brigand Isabella","Ninga Jessica"
                ,"Robber Sophie","Pitate Grace","Robber Sophia","Pitate Mia"};
        int nameIndex = ran.nextInt(10);
        int money = ran.nextInt(21)+10;
        
        EnemyCharacter newEnemy = new EnemyCharacter(enemyName[nameIndex]
                ,money);
        
        return newEnemy;
        
    }
    
    public static String battle(PlayableGameCharacter p, EnemyCharacter e){
        
        Random ran = new Random();
        String result = "";
        
        System.out.println("Suddenly, you bump into "+e.getName());
        e.speak();
        e.attack(p);
        System.out.print("says "+e.getName()+". ");
        System.out.println();
        p.speak();
        p.attack(e);
        System.out.print("says "+p.getName()+". ");
        System.out.println();
        System.out.println("----------Battle starts!------------------"
            +"------------------------------------------------------------"
            +"-----------------------------------------------------------");
        
        int defChance = 0;
        double damage = 0;
        double enemyLife = e.HITPOINTS;
        double myLife = p.getHitPoints();
        double MoneyChange = 0;

        
        boolean finishCombat =false;
        
        while(!finishCombat){
            
            if(enemyLife<=1){
                System.out.println("You win!");
                System.out.println("You got $"+e.getMoney()+" from "
                    +e.getName()+".");
                MoneyChange = p.getMoney()+e.getMoney();
                p.setMoney(MoneyChange);
                finishCombat=true;
                
            }
            else if(myLife<=1){
                System.out.println("You lose!");
                if(p.getMoney()>=e.getMoney()){
                    System.out.println("You lost half of your money!");
                    MoneyChange = p.getMoney()*0.5;
                    p.setMoney(MoneyChange);
                }
                else{
                    System.out.println("You lost all your money!");
                    p.setMoney(0);
                }
                finishCombat=true;
            }
            else{
                
                if(p.getSpeed() >= e.SPEED)
                {
                    System.out.println(p.getName()+" is faster, so you "
                            +"attack him!");
                    defChance = ran.nextInt(2);
                    if(defChance==0){
                        System.out.println(e.getName()+" try to defense... "
                                +"it works!");
                        damage = p.getAttackPower()-((e.DEFENSEPOWER)*0.5);
                        damage = damageCount(damage);
                                
                        System.out.println(e.getName()+" got "+damage
                                +" damage.");
                        enemyLife-=damage;
                        
                        if(myLife<0) myLife=1;
                        else if(enemyLife<0) enemyLife=1;
                        System.out.println("your life: "+myLife+".\nEnemy's "
                            +"life: "+enemyLife);
                    }
                    else{
                        System.out.println(e.getName()+" try to defense... fail!");
                        damage = p.getAttackPower();
                        damage = damageCount(damage);
                        
                        System.out.println(e.getName()+" got "+damage+" damage.");
                        enemyLife-=damage;
                        
                        if(myLife<0) myLife=1;
                        else if(enemyLife<0) enemyLife=1;
                        System.out.println("your life: "+myLife+".\nEnemy's "
                            +"life: "+enemyLife);
                    }
                    
                    System.out.println(e.getName()+" fights back!");
                    defChance = ran.nextInt(3);
                    if(defChance==0||defChance==1){
                        System.out.println(p.getName()+" try to defense... it works!");
                        damage = e.ATTACKPOWER-(p.getDefensePower()*0.5);
                        damage = damageCount(damage);
                        
                        System.out.println(p.getName()+" got "+damage+" damage.");
                        myLife-=damage;
                        
                        if(myLife<0) myLife=1;
                        else if(enemyLife<0) enemyLife=1;
                        System.out.println("your life: "+myLife+".\nEnemy's "
                            +"life: "+enemyLife);
                    }
                    else{
                        System.out.println(p.getName()+" try to defense... fail!");
                        damage = p.getAttackPower();
                        damage = damageCount(damage);
                        
                        System.out.println(p.getName()+" got "+damage+" damage.");
                        myLife-=damage;
                        
                        if(myLife<0) myLife=1;
                        else if(enemyLife<0) enemyLife=1;
                        System.out.println("your life: "+myLife+".\nEnemy's "
                            +"life: "+enemyLife);
                    }
                    System.out.println("----------NEXT ROUND------------------"
            +"------------------------------------------------------------"
            +"-----------------------------------------------------------");

                }
                else
                {
                    System.out.println(e.getName()+" is faster, so you are attacked!");
                    defChance = ran.nextInt(3);
                    if(defChance==0||defChance==1){
                        System.out.println(p.getName()+" try to defense... it works!");
                        damage = e.ATTACKPOWER-(p.getDefensePower()*0.5);
                        damage = damageCount(damage);
                        
                        System.out.println(p.getName()+" got "+damage+" damage.");
                        myLife-=damage;
                        
                        if(myLife<0) myLife=1;
                        else if(enemyLife<0) enemyLife=1;
                        System.out.println("your life: "+myLife+".\nEnemy's "
                            +"life: "+enemyLife);
                    }
                    else{
                        System.out.println(p.getName()+" try to defense... fail!");
                        damage = p.getAttackPower();
                        damage = damageCount(damage);
                        
                        System.out.println(p.getName()+" got "+damage+" damage.");
                        myLife-=damage;
                        
                        if(myLife<0) myLife=1;
                        else if(enemyLife<0) enemyLife=1;
                        System.out.println("your life: "+myLife+".\nEnemy's "
                            +"life: "+enemyLife);
                    }
                    
                    System.out.println(p.getName()+" fights back!");
                    defChance = ran.nextInt(3);
                    if(defChance==0){
                        System.out.println(e.getName()+" try to defense... it works!");
                        damage = p.getAttackPower()-((e.DEFENSEPOWER)*0.5);
                        damage = damageCount(damage);
                        
                        System.out.println(e.getName()+" got "+damage+" damage.");
                        enemyLife-=damage;
                        
                        if(myLife<0) myLife=1;
                        else if(enemyLife<0) enemyLife=1;
                        System.out.println("your life: "+myLife+".\nEnemy's "
                            +"life: "+enemyLife);
                    }
                    else{
                        System.out.println(e.getName()+" try to defense... fail!");
                        damage = p.getAttackPower();
                        damage = damageCount(damage);
                        
                        System.out.println(e.getName()+" got "+damage+" damage.");
                        enemyLife-=damage;
                        
                        if(myLife<0) myLife=1;
                        else if(enemyLife<0) enemyLife=1;
                        System.out.println("your life: "+myLife+".\nEnemy's "
                            +"life: "+enemyLife);
                    }
                    System.out.println("----------NEXT ROUND------------------"
            +"------------------------------------------------------------"
            +"-----------------------------------------------------------");
                    
                }
            }

            
        }
        
        
        
        return "yes!";
    }
    
    public static double damageCount(double d){
        if(d<=0){
            System.out.println("Your defense is too high, the enemy can only "
                    +"gives you five damage.");
            d=5;
        }
        return d;
    }
        
    public static void sellAndBuy(PlayableGameCharacter p){
        
        Scanner input = new Scanner(System.in);
        JavaErrorCheck jec = new JavaErrorCheck();
        
        ArrayList<Item> items = new ArrayList();
        TownCharacter businessman = new TownCharacter("King Burgess");
        System.out.println("Hi, my friend! I am "+businessman.getName());
        
        for (int i = 0; i < 5; i++) {
           items.add(new Item("Treasures","King Burgess' treasures!",10));
        }
        businessman.setInventory(items);
        
        System.out.println("I have those stuff...\n"
                +businessman.getInventory().size()+" treasures. What do you "
                +"need? Each one is ten gold coins!");
        
        System.out.println("1. Buy one treasure.(Enter 1)\n2. Sell one "
                +"treasure.(Enter 2)\n3. Check your treasures.(Enter 3)\n"
                +"4. Leave the store!(Enter 4)\n>");
        int choice = jec.checkIntOneToFour(input);
        
        while(choice!=4){
            
            switch(choice){
                case 1:
                    if(p.getMoney()>10){
                        if(businessman.getInventory().size()>0){
                            p.buyItem(businessman.getInventory().get(0));
                            p.loseMoney(10);
                            businessman.sellItem(
                                businessman.getInventory().get(0));
                        }
                        else{
                            System.out.println("Sorry, everything is sold "
                                +"out!");
                        }
                        System.out.println("You have "+p.getInventory().size()
                            +" treasures.\nAnd I have "
                            +businessman.getInventory().size()
                            +" treasures.");
                        System.out.println("The rest of your gold coins: $"
                                +p.getMoney());
                    }
                    else{
                        System.out.println("You have no enough gold coins!");
                    }
                    break;
                case 2:
                    if(p.getInventory().size()>0){
                        p.sellItem(p.getInventory().get(0));
                        double getMoney = p.getMoney()+10;
                        p.setMoney(getMoney);
                        System.out.println("The rest of your gold coins: $"
                                +p.getMoney());
                    }
                    else{
                        System.out.println("You have nothing to sell!");
                    }
                    break;
                case 3:
                    if(p.getInventory().size()>0){
                        System.out.println("I still have "
                                +p.getInventory().size()+" treasures.");
                        System.out.println("The label on th top said..."
                            +p.getInventory().get(0).getName());
                        System.out.println("The description is..."
                            +p.getInventory().get(0).getDescription());
                        System.out.println("The value is...$"
                            +p.getInventory().get(0).getValue());
                    }
                    else{
                        System.out.println("You have no items now.");
                    }
                    

                    break;
                case 4:
                    break;
            }
            input.nextLine();
            System.out.println("Still need anything?");
            System.out.println("1. Buy one treasure.(Enter 1)\n2. Sell one "
                +"treasure.(Enter 2)\n3. Check your treasures.(Enter 3)\n"
                +"4. Leave the store!(Enter 4)\n>");
            choice = jec.checkIntOneToFour(input);
            
        }
        System.out.println("Bye! Welcome to come again!");
    }
    
    public static void intersection(PlayableGameCharacter p){
        
        JavaErrorCheck jec = new JavaErrorCheck(); 
        Scanner input = new Scanner(System.in);
        
        Direction dL = p.turnLeft();
        Direction dR = p.turnRight();
        System.out.println("You bump into a intersection, what do you want to "
                +"do?");
        System.out.println("1. Turn Left.(Enter 1)\n2. Turn Right.(Enter 2)\n>");
        int choice = jec.checkIntOneTwo(input);
        
        if(choice==1){
            System.out.println("Your choice is to turn "+dL.getDirectionName());
        }
        else{
            System.out.println("Your choice is to turn "+dR.getDirectionName());
        }
        
    }
    
    public static void submitMoney(PlayableGameCharacter p){
        
        double restMoney = 0;
        if(p.getMoney()>=1000){
            restMoney=p.getMoney()-1000;
            p.setMoney(restMoney);
            System.out.println("King Burgess: Good job, my friend!");
            System.out.println("You have done a awesome work to help my town!");
            System.out.println("Hope to see you next time!");
            System.exit(0);
        }
        else{
            System.out.println("Your money is not enough!\nYour gold coins "
                    +"are : $"+p.getMoney());
            
        }
        
    }
    
    public static void missionStart(GameCharacter g){
        
        JavaErrorCheck jec = new JavaErrorCheck();
        Random ran = new Random();
        Scanner input = new Scanner(System.in);
        
        PlayableGameCharacter p = new PlayableGameCharacter();
        if(g instanceof PlayableGameCharacter){
            p = (PlayableGameCharacter)g;
        }
        System.out.println("---------------------------------------------------"
            +"---------------------------------------------------"
            +"---------------------------------------------------");
        do{
            System.out.println("What do you want to do now?");
            System.out.println("1. Shopping.(Enter 1)\n2. Check my info. (Enter 2)"
                +"\n3. Start adventures now.(Enter 3)\n4. Submit my money. "
                +"(Enter 4)\n5. Leave this town(Enter 5) > ");
            int choice = jec.checkIntOneToFive(input);
        
            switch(choice){
                case 1:
                    sellAndBuy(p);
                    System.out.println("------------------------------------"
                        +"--------------------------------------------------"
                        +"--------------------------------------------------"
                        +"-----------------");
                    break;
                case 2:
                    System.out.println(p);
                    System.out.println("------------------------------------"
                        +"--------------------------------------------------"
                        +"--------------------------------------------------"
                        +"-----------------");
                    break;
                case 3:
                    adventures(p);
                    System.out.println("------------------------------------"
                        +"--------------------------------------------------"
                        +"--------------------------------------------------"
                        +"-----------------");
                    break;
                case 4:
                    submitMoney(p);
                    System.out.println("------------------------------------"
                        +"--------------------------------------------------"
                        +"--------------------------------------------------"
                        +"-----------------");
                    break;
                case 5:
                    System.out.println("King Burgess: I am so sorry you have "
                        +"to leave my twon, wish you the best!");
                    System.exit(0);
                    break;
            }
            input.nextLine();
        }while(true);

        
    }
    
    public static void adventures(PlayableGameCharacter p){
        
        JavaErrorCheck jec = new JavaErrorCheck();
        Random ran = new Random();
        Scanner input = new Scanner(System.in);
        
        int chance = ran.nextInt(10);
        int getMoney = ran.nextInt(101)+100;
        int loseMoney = ran.nextInt(100)+1;
        switch(8){
            case 0:
                villagerHi();
                break;
            case 1:
                villagerHi();
                break;
            case 2:
                villagerHi();
                break; 
            case 3:
                System.out.println("You find something behind the rock...");
                System.out.println("You got $"+getMoney);
                p.gainMoney(getMoney);
                break;    
            case 4:
                System.out.println("You find something behind the rock...");
                System.out.println("You got a treasure!");
                p.gainItem(new Item());
                break;    
            case 5:
                System.out.println("Oh no! You find out that you just lost "
                        +"something...");
                if(p.getMoney()>=loseMoney){
                    System.out.println("You lost $"+loseMoney);
                    p.loseMoney(loseMoney);
                }
                else{
                    System.out.println("You lost all of your money!");
                    p.setMoney(0);
                }
                break; 
            case 6:
                System.out.println("Oh no! You find out that you just lost "
                    +"something...");
                if(p.getInventory().size()>0){
                    System.out.println("You lost one treasure!");
                    p.loseItem(p.getInventory().get(0));
                }
                else{
                    System.out.println("You lost all of your items!");
                }
                break;
            case 7:
                System.out.println("You walk and walk... Suddenly!!?");
                intersection(p);
                break;
            case 8:
                battle(p,mkEnemy());
                break;
            case 9:
                battle(p,mkEnemy());
                break;
        }
        
    }
    
}
