/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_2022212.ch4_5_constructor_5;

/**
 *
 * @author xvpow
 */
public class Ch4_5 {
    public static void main(String[] args){
        
        Animal dog1 = new Dog("喵喵",10,2);
        dog1.print();
        Animal cat1 = new Cat("汪汪",5,1);
        cat1.print();
        
        Animal dog2 = new Dog("Momo",7,-3);
        dog2.print();
    }
}
