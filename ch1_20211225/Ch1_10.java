/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20211225;

/**
 *
 * @author xvpow
 */
public class Ch1_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        //0~35
        //36~53
        //54~70
        //以上
        int pm25 = 85;
        if (pm25 >= 0 && pm25 <= 35) System.out.println("低");
        else if(pm25 >= 36 && pm25 <= 53)  System.out.println("中"); 
        else if(pm25 >= 54 && pm25 <= 70) System.out.println("高"); 
        else if(pm25 > 71) {            
            int x = 25;
            System.out.println("非常高"); 
        }

        
    }
    
}
