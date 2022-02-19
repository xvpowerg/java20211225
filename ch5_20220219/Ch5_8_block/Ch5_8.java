/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20220219.Ch5_8_block;

/**
 *
 * @author xvpow
 */
public class Ch5_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Test1 t1 = new Test1();
       t1.append(3, "A");
      System.out.println(t1.find("A"));
        Test1 t2 = new Test1(10);
        t2.append(2, "B");
        t2.find("B");
        
        Test1 r3 = new Test1(10,"");
        r3.find("C");
        
       
    }
    
}
