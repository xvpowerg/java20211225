/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20211225;

/**
 *
 * @author xvpow
 */
public class Ch1_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //邏輯運算子
        
       boolean b1 = true,b2 = false;
       //且運算 必須兩邊都為true
       System.out.println(b1 && b2);
       //或運算 單邊為true就是true
       System.out.println(b1 || b2);
       //反向 !
       System.out.println(!b2);
       //互斥 一true一false才為true
       System.out.println(b1 ^ b2);
       
       //是否為null放左邊
       //基本型態比較放左邊 右邊放參考型態的比較
       int c = 1;
       //且的短路 左邊false右邊不執行
       boolean b3 = c < 0 && ++c < 6;
       System.out.println(c);
       //或的短路 左邊true右邊不執行
       boolean b4 = c > 0 || ++c < 7;
       System.out.println(c);
       
        
    }
    
}
