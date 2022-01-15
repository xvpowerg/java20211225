/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220115.ch3_6_wrapper3;

/**
 *
 * @author xvpow
 */
public class Ch3_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String v1 = "123";
        //字串轉整數
       int v2 = Integer.parseInt(v1);
       System.out.println(v2+5);
       System.out.println(v1+5);
       
      String bs1 = Integer.toBinaryString(1234);
      String hexStr =  Integer.toHexString(1234);
      String octStr = Integer.toOctalString(1234);
      System.out.println(bs1+":"+hexStr+":"+octStr);
        
  
      
    }
    
}
