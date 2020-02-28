/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog24178.assignment2.test;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Scanner;


/**
 *
 * @author Admin
 */
import prog24178.assignment2.PlayableGameCharacter;
public class GameCharacterTest {
    
    @Test
    public void shouldReturnName(){
        Scanner sc = new Scanner(System.in);
        PlayableGameCharacter c1 = new PlayableGameCharacter();
        System.out.println("Please input your name");
        c1.setName(sc.nextLine());
        assertEquals("Tom",c1.getName());
    }
}
