/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20220305.Ch7_6_Interface_functional;

import java.util.function.Supplier;
import java.util.Random;

public class TestSupplier implements Supplier<String> {
    public String get(){
        String[] v1 = {"Ken","Vivin","Lucy","Iris"};
        Random ran = new Random();  
         int index = 0;
         index = ran.nextInt(v1.length);//0~3
      //使用亂數在陣列中取一個數  
      return v1[index];
    }
}
