/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_2022212.ch4_6_Override_1;

/**
 *
 * @author xvpow
 */
public class Test1 {
    private String value1;
    private int value2;
    
    public Test1(String value1,int value2){
            this.value1 = value1;
            this.value2 = value2;
    }
    public void print(){
        System.out.println(value1+":"+value2);
    }
}
