/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20211225;

/**
 *
 * @author xvpow
 */
public class Ch1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //比較運算子 是比基本型態
        int a = 11,b = 20;
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println("===============================");
        String st1 = "Ken";
        String st2 = "Ken";
        String st3 = "Vivin";
        String st4 = new String("Ken");
        //參考型別 比較時 是比較記憶體位置
        System.out.println(st1+":"+st2+":"+st3+":"+st4);
        System.out.println(st1 == st2);
        System.out.println(st1 == st3);
        System.out.println(st4 == st2);
        System.out.println(st4.equals(st2));
        
    }
    
}
