/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220115.ch3_9_overload2;

/**
 *
 * @author xvpow
 */
public class Ch3_9 {
    //1 相同類型
    //2 相同類型可相容
    //3 不同類型可相容
    //4 封箱類型
    
     //1 相同類型
        static void test1(int v1){
            System.out.println("int v1");
        }
        static void test1(long v2){
            System.out.println("long v2");
        }
   //2 相同類型可相容   
     static void test2(long v1){
         System.out.println("long v1");
     }
     static void test2(float v2){
         System.out.println("float v2");
     }
       //3 不同類型可相容
     static void test3(byte b1){
         System.out.println("test3 byte");
     }
     
     static void test3(float f1){
         System.out.println("test3 float ");
     }
     //4 封箱類型
     static void test4(byte b1){
         System.out.println("test4 Byte");
     }
     static void test4(Integer v1){
         System.out.println("test4 Integer");
     }
     
     static void test5(byte b1){
         System.out.println("Byte Test5!");
     }
     //Float 不相容Integer
     static void test5(Float f1){
         System.out.println("Float Test5!");
     }
     
     static void test6(byte b1){
         System.out.println("Byte Test5!");
     }
     //Float 不相容Integer
     static void test6(Number f1){
         System.out.println("Number Test5!");
     }
    public static void main(String[] args) {
       test1(20);
       test2(15);
       test2(15.5F);
       test3(26);       
       test4(17);
       Integer vx = 10;       
       Number n =vx;        
       test5(25.5f);
        test6(25);
    }
    
}
