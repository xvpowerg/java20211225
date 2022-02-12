/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_2022212.ch4_2_constructor_2;

/**
 *
 * @author xvpow
 */
public class Test1 {
    public Test1(){        
        System.out.println("Test()");
    }
    public Test1(int v){
        this("Ken",20);
        System.out.println("int ");
    }
    public Test1(String v1,int v2){
        this();
        System.out.println("String int");
    }
}
