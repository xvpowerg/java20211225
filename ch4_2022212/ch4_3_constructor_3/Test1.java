/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_2022212.ch4_3_constructor_3;

/**
 *
 * @author xvpow
 */
public class Test1 {
    private String name;
    private int value2;

    public Test1(String name,int value2){
        this.name = name;
        this.value2 = value2;
    }

    public void print(){
        System.out.println(name+":"+value2);
    }
    
}
