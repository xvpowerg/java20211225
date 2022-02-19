/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20220219.Ch5_10_block_older;

/**
 *
 * @author xvpow
 */
public class Test1 {
    public Test1(){
        System.out.println("Test1()");
    }
    {
        System.out.println("Not Static Block 1");
    }
    static{
        System.out.println("Static Block 1");
    }
    
    {
        System.out.println("Not Static Block 2");
    }
    static{
    System.out.println("Static Block 2");
    }
}
