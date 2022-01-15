/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220115.ch3_1_func1_call_by_value;

/**
 *
 * @author xvpow
 */
public class Ch3_1 {
    //call by value
    static void swap(int a,int b){
         int tmp = a;
        a = b;
        b = tmp;
    }

    public static void main(String[] args) {
            //所有基本型態都是call by value
        
        int a = 10,b =20;
        
//        a = a ^ b;
//        System.out.println(a);
//        b =  a ^ b;
//        System.out.println(b);
//        a = a ^ b;
//        System.out.println(b);
//        System.out.println(a+":"+b);
        swap(a, b);       
        System.out.println(a+":"+b);
        
        
    }
    
}
