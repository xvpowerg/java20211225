/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20211225;

/**
 *
 * @author xvpow
 */
public class Ch1_8 {

    public static void main(String[] args) {
           int v1 = 1;
           //10000
           int n = 4;
           //可求2的n次方
           int x = v1 << n; //v1 如果是１就是２的ｎ次方
           System.out.println(x);
           
           int v2 = 2;
           int n2 = 2;
           ////001000
           int x2 = v2 << n2;
           System.out.println(x2);
           
           
           int v3 = 32;
           int n3 = 1;
           // v3/2^n3
           //好用!! 除法在電腦很慢 
           //如果要除2次方的類型 請使用>>
           int v4 = v3 >> n3;
           System.out.println(v4);
    }
    
}
