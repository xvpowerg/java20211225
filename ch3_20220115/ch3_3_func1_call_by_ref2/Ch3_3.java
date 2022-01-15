/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220115.ch3_3_func1_call_by_ref2;

/**
 *
 * @author xvpow
 */
public class Ch3_3 {
    
       static void swap(String v1,String v2){
           String tmp = v1;
                v1 = v2 ;
                v2 = tmp;
       }
       
    public static void main(String[] args) {
      String v1 = "A1",v2 = "B2";
      swap(v1,v2);
      System.out.println(v1+":"+v2);
      
    }
    
}
