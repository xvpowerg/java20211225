/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220115.ch3_5_wrapper2;

/**
 *
 * @author xvpow
 */
public class Ch3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //-128~127取一樣的參考
        Integer v1 = Integer.valueOf(5);
        Integer v2 = Integer.valueOf(5);
        System.out.println(v1 == v2);
        
        Integer v3 = Integer.valueOf(650);
        Integer v4 = Integer.valueOf(650);
        System.out.println(v3 == v4);
        
        
        Integer v5 = 100;
        Integer v6 = 100;
        System.out.println(v5 == v6);
        
        Integer v7 = 160;
        Integer v8 = 160;
        
        System.out.println(v7 == v8);
        
        int v9 = v8;
        System.out.println(v9);
        
        Integer v10 = null;//java.lang.NullPointerException
        int v11 = v10;
        System.out.println(v11);
        
        
    }
    
}
