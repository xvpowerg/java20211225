/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20211225;

/**
 *
 * @author xvpow
 */
public class Ch1_11 {
    public static void main(String[] args) {
        // TODO code application logic here
        //switch 參數類型有 
        //整數 byte short int 
        //字元 char 
        //字串 String
        //列舉 enum
        int action = 90;
        switch(action){       
            case 10:
                System.out.println("A");
                break;
             default:
                System.out.println("Erro!!");
              break;     
            case 20:
               System.out.println("B"); 
                break;
            case 30:
               System.out.println("C");  
                break;     
        }
        
    }
    
}
