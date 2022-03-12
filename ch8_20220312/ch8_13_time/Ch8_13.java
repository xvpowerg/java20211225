/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20220312.ch8_13_time;
import java.time.LocalTime;
/**
 *
 * @author xvpow
 */
public class Ch8_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalTime ltime = LocalTime.now();      
        System.out.println(ltime);
         
        LocalTime time2 = LocalTime.of(8, 5);
        System.out.println(time2);
          LocalTime time3 =time2.plusHours(2);
          System.out.println(time3);
           LocalTime time4 = time2.minusHours(2);
           System.out.println(time4);
           
         System.out.println(time2.isAfter(time4));
         System.out.println(time2.isBefore(time3));
    }
    
}
