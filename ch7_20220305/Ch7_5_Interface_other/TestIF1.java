/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch7_20220305.Ch7_5_Interface_other;

/**
 *
 * @author xvpow
 */
@FunctionalInterface
public interface TestIF1 {
    //介面屬性一律為靜態常數!習慣大寫
    int MAX = 10;
    //如果一介面 他的抽象方法只有一個 那麼可稱為FunctionalInterface
    void method();    
}
