/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch7_20220305.Ch7_4_Interace_default4;

/**
 *
 * @author xvpow
 */
//extends TestIF1
public interface TestIF2   {
       default void  defMethod(){
        System.out.println("defMethod TestIF2");
    }
//    static void staticMethod(){
//        System.out.println("staticMethod TestIF2");
//    }
}
