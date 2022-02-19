/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20220219.Ch5_5_exception5.myexception;

/**
 *
 * @author xvpow
 */
public class TestUnCatchedException
        extends RuntimeException{
    public TestUnCatchedException(){}
    public TestUnCatchedException(String msg){
        super(msg);
    }
}
