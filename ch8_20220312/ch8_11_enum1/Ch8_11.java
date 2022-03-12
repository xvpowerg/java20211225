/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20220312.ch8_11_enum1;

import ch8_20220312.ch8_11_enum1.MediePlay.Action;

/**
 *
 * @author xvpow
 */
public class Ch8_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MediePlay.action(MediePlay.Action.EXIT);
        MediePlay.action(MediePlay.Action.PAUSE);
        MediePlay.action(MediePlay.Action.PLAY);
        
        
       System.out.println(MediePlay.Action.EXIT.getClass()== Action.class); 
       System.out.println(MediePlay.Action.EXIT.name());
       System.out.println(MediePlay.Action.STOP.ordinal());
       
       System.out.println(MediePlay.Action.valueOf("EXIT"));
     //  System.out.println(MediePlay.Action.valueOf("XXX"));
     for(Action a : MediePlay.Action.values()){
         System.out.println(a);
     }
    }
    
}
