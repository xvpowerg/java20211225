/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20220226.ch6_4_shade4;

/**
 *
 * @author xvpow
 */
public class Ch6_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Test1 t1 = new Test2();
       t1.method1();
       //靜態正確呼叫方式如下
        Test1.method1();
        Test2.method1();
        
    }
    
}
