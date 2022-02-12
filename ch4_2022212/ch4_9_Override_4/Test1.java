/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_2022212.ch4_9_Override_4;

/**
 *
 * @author xvpow
 */
public class Test1 {
    
    public int method1(){
        System.out.print("Test1 method1");
        return 10;
    }
    
    public int method2(){
        System.out.print("Test1 method2");
        return 20;
    }    
    public Test1 method3(){
        System.out.println("Test1 method3");
        return new Test1();
    }
}
