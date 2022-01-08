/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220108;

/**
 *
 * @author xvpow
 */
public class Ch2_1 {
    static int test1(){
        System.out.println("Test1");
        return 1;
    }
    static boolean test2(){
        System.out.println("Test2");
        return true;
    }
    static void test3(){
        System.out.println("Test3");
    }
    
    
    public static void main(String[] args) {
     
        for (int i = test1();i <= 3 && test2();i++,test3()){
            System.out.println("body:"+i);            
        }
        
        //Test1
        //Test2
        //body:1
        
        //Test3
        //Test2
        //body:2
        
        //Test3
        //Test2
         //body:3
        
         //Test3
         
    }
    
}
