/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20220409.Ch12_12_io6;

/**
 *
 * @author xvpow
 */
public class TestClose2 implements AutoCloseable{
       private boolean b1 = false;
    
    public TestClose2(boolean b1){
        this.b1 = b1;
    }
      public TestClose2(){        
    }
    public void close()throws Exception{
        System.out.println("TestClose2  close");
        if (b1){
            throw new Exception("TestClose2 ex");
        }
    } 
}
