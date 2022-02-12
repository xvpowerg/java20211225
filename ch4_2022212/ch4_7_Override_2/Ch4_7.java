/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_2022212.ch4_7_Override_2;

/**
 *
 * @author xvpow
 */
public class Ch4_7 {

   /*
    複寫規則
    1 讀取權限(Modifier) 只能開放不能封閉
    2 回傳值如果是基本型態 一定要一樣 如果參考型態可以是子類或一樣
    3 方法名稱跟參數必須一樣
    4 可拋出一樣例外 或是 子類例外 或是不拋出    
    */
    public static void main(String[] args) {
        
        Test1 t1 = new Test1();
        System.out.println(t1.publicValue1);
        System.out.println(t1.protectedValue2);
        System.out.println(t1.defaultValue3);
        
    }
    
}
