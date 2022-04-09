/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20220409.Ch12_12_io6;

/**
 *
 * @author xvpow
 */
public class TestClose1  implements AutoCloseable{
    private boolean b1 = false;
    
    public TestClose1(boolean b1){
        this.b1 = b1;
    }
      public TestClose1(){        
    }
    public void close()throws Exception{
        System.out.println("TestClose1  close");
        if (b1){
            throw new Exception("TestClose1 ex");
        }
    }
}
