/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_2022212.ch4_8_2_Override_3;
import ch4_2022212.ch4_8_Override_3.Test1;
/**
 *
 * @author xvpow
 */
public class Test3  extends Test1{
    
    public void testPublic(){
        System.out.println("Test3 testPublic");
    }
    
    protected void testProtected(){
       System.out.println("Test3 testProtected");
    }
   //跨package無法複寫 因為Default 無法被繼承到新的類別    
    private void testDefault(){
         System.out.println("Test3 testDefault");
    }
}
