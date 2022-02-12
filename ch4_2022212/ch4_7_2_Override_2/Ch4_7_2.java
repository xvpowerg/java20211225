/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_2022212.ch4_7_2_Override_2;
import ch4_2022212.ch4_7_Override_2.Test1;

/**
 *
 * @author xvpow
 */
public class Ch4_7_2 {

    public static void main(String[] args) {
        //因為在不同package 使用類別 必須import
       Test1 t1 = new Test1();
       System.out.println(t1.publicValue1);
       Test2 t2 = new Test2();
       t2.testValue();
    }
    
}
