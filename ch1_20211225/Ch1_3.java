/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20211225;

/**
 *
 * @author xvpow
 */
public class Ch1_3 {
    
    public static void main(String[] args) {
       int count = 0;
       count++;
       ++count;
       System.out.println(count);
      
       int x = 0;
       System.out.println(x++);//0
       System.out.println(++x);//2
       
       int c = 0;
       int ans = c++ + 2 + ++c + 1 + c--;
               //0  +  2 +  2  + 1  + 2 
               
       System.out.println(ans);
       System.out.println(c);
       
        
    }
    
}
