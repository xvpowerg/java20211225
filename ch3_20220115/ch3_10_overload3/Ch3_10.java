/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220115.ch3_10_overload3;

/**
 *
 * @author xvpow
 */
public class Ch3_10 {

    //1 相同類型
    //2 相同類型可相容
    //3 不同類型可相容
    //4 封箱類型
  
    //1 相同類型
    static void test1(int v1,int v2){
        System.out.println("test1 int int");
    }
    static void test1(float v1,float v2){
        System.out.println("test1 float float");
    }
     //2 相同類型可相容
    
    static void test2(Integer v1,Integer v2){
         System.out.println("test1 Integer Integer");
    }
    static void test2(long v1,long v2){
        System.out.println("test2 long long");
    }
    
     //3 不同類型可相容
    static void test3(byte b1,short s1){
        System.out.println("test3 byte short");
    }
    static void test3(float v1,Integer v2){
        System.out.println("test3 float Integer");
    }
    
    static void test4(Integer v1,float v2,int v3){
        
    }
    static void test4(int v1,byte v2,Integer v3){
        
    }
    
    public static void main(String[] args) {       
        
        test1(10,25);
        test2(7,11);
        test3(10,20);
        test4(1,2.5f,3);
    }
    
}
