/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

import org.junit.Test;
import static org.junit.Assert.*;
import prog24178.assignment2.*;

/**
 *
 * @author Admin
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @Test
    public void shouldReturnName(){
        Scanner sc = new Scanner(System.in);
        PlayableGameCharacter c1 = new PlayableGameCharacter();
        System.out.println("Please input your name");
        c1.setName(sc.nextLine());
        assertEquals("Tom",c1.getName());
        PlayableGameCharacter c2 = new PlayableGameCharacter("Han", 20, 10, 5, 5, 6);
        assertEquals("Han",c2.getName());
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
