/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20220226.ch6_10_interface2;

public class Ch6_10 {

    public static void main(String[] args) {
       
        IrommanGroup ironman = new IronMan();
        System.out.println(ironman.attacking(2));
        ironman.flying();
        System.out.println("Speed:"+ironman.runing());
        
                
        
    }
    
}
