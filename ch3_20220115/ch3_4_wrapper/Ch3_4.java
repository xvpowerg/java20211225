/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220115.ch3_4_wrapper;

public class Ch3_4 {
    public static void main(String[] args) {
       //wrapper 包裝
       //Boxing 封箱 
       //基本型態    封箱
       //byte      Byte  
       //short    Short
       //int      Integer
       //long     Long
       //char    Charachter
       //boolen    Boolean
        
       //手動封箱
       Integer v1 = Integer.valueOf(25);
       //手動解封箱
       int v2 = v1.intValue();
       System.out.println(v2);
       
       //自動封箱
       Integer v3 = 72;
       //自動解封箱
       int v4 = v3;
       System.out.println(v3+":"+v4);
       
       
       
        
    }
    
}
