/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_2022212.ch4_6_Override_1;

/**
 *
 * @author xvpow
 */
public class Test2  extends Test1{
    public Test2(String value1,int value2){
        super(value1,value2);
    }
   // @Override //是否為正確的Override
    public void print(int value1){
        System.out.println("value1:"+value1);
    }
    

}
