/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20220219.Ch5_5_exception5;
import ch5_20220219.Ch5_5_exception5.myexception.TestUnCatchedException;
/**
 *
 * @author xvpow
 */
public class TestMyException{
    public static void test1CatchedException(int v)throws MyCatchedException{
        if (v > 50) throw new MyCatchedException("大於50");
    }
    
    public static void test2UnCatchedException(int v) throws TestUnCatchedException{
            if (v < 50) throw new TestUnCatchedException("小於50");
    }
}
