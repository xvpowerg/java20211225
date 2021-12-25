/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20211225;

/**
 *
 * @author xvpow
 */
public class Ch1_1 {
    public static void main(String[] args) {
        /*
        變數型態        
            基本型態:
                整數
                    byte 8bit -128 ~ 127
                    short 16bit -32768 ~ 32767
                    int 32bit -2147483648 ~ 2147483647
                    long 64bit 
                浮點數
                   float  
                   double 
                字元
                    chart 0~65535 
                布林
                    boolean
            參考型態:
                   不是基本型態就是參考
        */
        
        /*
        開頭可以是 英文  _ $
        第二字母可以是 英文  _ $ 數字
        關鍵字不能用
        */
        //參考型態
        String name = "Ken";
        int $_age = 25;
        System.out.println(name+":"+$_age);
        
        long v1 = 2147483648L;
        //會考
        float pi = 3.1415f;
        
        char c1 = 97;
        char c2 = 'B';        
        char c3 = '\u0065';
        //以下錯誤 不可為負數
        //char c4 = -12;
        //字元單引號
        //char c5 = "B";
        System.out.println(c1+":"+c2+":"+c3);
        
        boolean b1 = true;
        boolean b2  = false;
        System.out.println(b1 +":"+b2);
        
    }
    
}
