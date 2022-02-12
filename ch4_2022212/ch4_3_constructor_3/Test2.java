/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_2022212.ch4_3_constructor_3;

/**
 *
 * @author xvpow
 */
public class Test2 extends Test1 {
    //所有建構式都會呼叫super()除非你自己呼叫this(...)或super(....)
    public Test2(String name,int age){
        super(name,age);
    }
}
