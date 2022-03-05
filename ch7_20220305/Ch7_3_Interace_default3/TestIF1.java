/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch7_20220305.Ch7_3_Interace_default3;

/**
 *
 * @author xvpow
 */
public interface TestIF1 {
    default void  defMethod(){
        System.out.println("defMethod TestIF1");
    }
    static void staticMethod(){
        System.out.println("staticMethod TestIF1");
    }
}
