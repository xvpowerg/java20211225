/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_2022212.ch4_5_constructor_5;

/**
 *
 * @author xvpow
 */
public class Cat extends Animal {
    public Cat(String name,float height,int age){
        super(name,height,age);
    }
    
    public void print(){
        System.out.print("Cat:");
        super.print();
    }
}
