/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch7_20220305.Ch7_4_Interace_default4;

/**
 *
 * @author xvpow
 */
//解法有三種
//移除 TestIF1  或 TestIF2
//TestIF3複寫 defMethod
//TestIF2 繼承 TestIF1 並複寫 defMethod
//靜態的方法不會繼承所以不會重複方法問題
public interface TestIF3 extends TestIF2,TestIF1 {
          default void  defMethod(){
        System.out.println("defMethod TestIF1");
    }
}
