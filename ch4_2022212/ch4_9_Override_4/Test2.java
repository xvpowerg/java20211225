/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_2022212.ch4_9_Override_4;
public class Test2  extends Test1{
    
    public int method1(){
        System.out.print("Test2 method1");
        return 20;
    }
    //錯誤因為父類別回傳值是基本型態 所以無法使用其他類型的回傳值
//       public short method2(){
//        System.out.print("Test1 method2");
//        return (short)20;
//    }
    
    public Test2 method3(){
            System.out.println("Test2 method3");
        return  new Test2();
    }
}
