/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220115.ch3_8_overload1;

public class Ch3_8 {
    //overloading 
    //方法名稱一樣
    //參數的類型 或 數量不一樣    
      static int sum(int v1,int v2){
          int ans = v1 + v2;
          return ans;
      }
      
      static float sum(float v1,float v2){
          float ans = v1 + v2;
          return ans;
      }
      
      static void printValue(int v){
          System.out.println("int:"+v);
      }
      
      static void printValue(float v){
          System.out.println("float:"+v);
      }
    
    public static void main(String[] args) {
     
        printValue(sum(5,2));
        printValue(sum(2.5f,7.9f));
    }
    
}
