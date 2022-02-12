/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_2022212.ch4_4_constructor_4;

/**
 *
 * @author xvpow
 */
public class Test1 {
    Test1(){
        this(12,30);
        System.out.println("Test1()");
    }
    Test1(int v1,int v2){
        System.out.printf("Test1 v1:%d ,v2:%d %n",v1,v2);
    }
}
