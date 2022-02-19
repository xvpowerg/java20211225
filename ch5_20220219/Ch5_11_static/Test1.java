/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20220219.Ch5_11_static;

/**
 *
 * @author xvpow
 */
public class Test1 {
    private String value1;
    private static String value2;
    public void setValue1(String v1){
        value1 = v1;
    }
    public void setValue2(String v2){
        value2 = v2;
    }
    public String toString(){
        return value1+":"+value2;
    }
}
