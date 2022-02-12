/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_2022212.ch4_9_Override_4;

/**
 *
 * @author xvpow
 */
public class Ch4_9 {

    public static void main(String[] args) {
       
        Test1 t1 = new Test2();
        System.out.println(":"+t1.method1());
         Test1 t2 = t1.method3();
         System.out.println(t2.getClass().getName());
    }
    
}
