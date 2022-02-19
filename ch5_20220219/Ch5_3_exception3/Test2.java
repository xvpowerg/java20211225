/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20220219.Ch5_3_exception3;

/**
 *
 * @author xvpow
 */
public class Test2 {
    public static void testuncatched(int v){
            if (v < 50){
                throw new IllegalStateException("狀態錯誤!!");
            }
    }
}
