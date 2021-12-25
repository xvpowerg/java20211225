/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20211225;

/**
 *
 * @author xvpow
 */
public class Ch1_12 {
    public static void main(String[] args) {
        //null空無一物
        //String name = "Iris";
        String name = null;
        
        switch(name){
            case  "Ken":
                System.out.println("RD");
                break;
            case "Vivin":
                System.out.println("PM");
                break;
            case "Lucy":
                 System.out.println("Manager"); 
                break;
            default:
                System.out.println("Error!!");
                break;
        }
        
        
    }
    
}
