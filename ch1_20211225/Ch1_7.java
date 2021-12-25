/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20211225;

/**
 *
 * @author xvpow
 */
public class Ch1_7 {

    public static void main(String[] args) {
      // | & ^ 以上都跟數學計算有關!
      int v1 = 10, v2 = 25;
      System.out.println(v1 & v2);
      System.out.println(v1 | v2);
      //01010  
      //11001
    //&========== 去背過濾
      //01000
    //|=========== 融合
    //  11011
      System.out.println(v1 ^ v2);
      int v3 = v1 ^ v2;
    //^==================互斥
    // 10011   
    System.out.println(v3 ^ v1);//A 拿到的是v2加密的
    System.out.println(v3 ^ v2);//B 拿到的是v1加密的
    
    }
    
}
