/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220115.ch3_13_oo2_encapsulation;

/**
 *
 * @author xvpow
 */
public class Ch3_13 {
// encapsulation 封裝
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student st1 = new Student();
       //st1.name = "Lucy";
       st1.height = 163;
       //st1.age = 3000;
       st1.setName(null);
       st1.setAge(3000);
       
       st1.print();
       
       
    }
    
}

