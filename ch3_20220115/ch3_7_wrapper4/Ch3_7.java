/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220115.ch3_7_wrapper4;

/**
 *
 * @author xvpow
 */
public class Ch3_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v1 = Integer.parseInt("123");
        System.out.println(v1);
        //只能是阿拉伯數字 不能有空格!
        //int v2 =  Integer.parseInt("1 23");
        //System.out.println(v2);
        //字串轉boolean 只要不是 連續的true就 回傳false
          boolean b1 = Boolean.parseBoolean("true");
          System.out.println(b1);
          boolean b2 = Boolean.parseBoolean("tRUe");
          System.out.println(b2);
         boolean b3 = Boolean.parseBoolean("tR  Ue");
         System.out.println(b3);
    }
    
}
