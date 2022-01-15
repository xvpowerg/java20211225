/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220115.ch3_11_overload4;

/**
 *
 * @author xvpow
 */
public class Ch3_11 {
//多參數時注意一定要有某一個條件 是可確定的
   static void test1(int v1,Integer v2){
       System.out.println("test1 int Integer");
   }
   
   static void test1(Integer v1,int v2){
       System.out.println("test1 Integer  int" );
   }
   
   static void test2(int v1,float v2,Integer v3){
       System.out.println("test2 int float Integer");
   }
      static void test2(int v1,Integer v3,float v2){
       System.out.println("test2 int Integer float");
   }
    public static void main(String[] args) {
        // TODO code application logic here
        //模凌兩可
        //test1(10,60);
        test1(Integer.valueOf(10),50);
        //test2(1,2,3);
        test2(1,2f,3);
    }
    
}
