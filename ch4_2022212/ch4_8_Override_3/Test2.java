/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_2022212.ch4_8_Override_3;

/**
 *
 * @author xvpow
 */
public class Test2 extends Test1{
    @Override
     public void testPublic(){
         System.out.println("Test2 testPublic");
     }
     //public
    protected void testProtected(){
         System.out.println("Test2 testProtected");
     }
    //public
    //protected    
     void testDefault(){
        System.out.println("Test2 Default!");
    }
     //testPrivate 不是複寫
     //因為根本看不到 所以談不上複寫     
    // @Override
      void testPrivate(){
         System.out.println("Test2 Private");
     }
}
