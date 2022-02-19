/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20220219.Ch5_7_obj_method;

/**
 *
 * @author xvpow
 */
public class Ch5_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Product p1 = new Product("PS5",100);
      Product p2 = new Product("PS5",100);
      Product p3 = new Product("Switch",50);
       Product p4 = null;
      Product p5 = new Product("iPhone",100);  
      Product p6 = new Product(null,100);
      Ch5_7 c57 = new Ch5_7();
      System.out.println(p1);
      System.out.println(p2);
      System.out.println(p3);   
      System.out.println(p3.getClass().
              getName()+"@"+Integer.toHexString(p3.hashCode())  );
      
        System.out.println(p1.equals(p2));
      //equals 預設情況比較兩變數是否為同一個參考
      System.out.println(p1.equals(p1));
      //比較不同類別
      System.out.println(p1.equals(c57));
      //null問題
      System.out.println(p1.equals(p4));
      //比較多個屬性
      System.out.println(p1.equals(p5));
      //屬性為null處理
        System.out.println(p1.equals(p6)); 
      
    }
    
}

