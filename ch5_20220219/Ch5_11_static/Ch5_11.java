/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20220219.Ch5_11_static;

/**
 *
 * @author xvpow
 */
public class Ch5_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Test1 t1 = new Test1();
        Test1 t2 = new Test1();
        t1.setValue1("A1");
        t2.setValue1("B1");
        //靜態static共享同一各類
        t1.setValue2("X2");
        t2.setValue2("Z2");
        System.out.println(t1+":"+t2);
    }
    
}
