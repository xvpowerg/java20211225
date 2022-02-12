/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_2022212.ch4_1_constructor_1;

/**
 *
 * @author xvpow
 */
public class Test1 {
   private String name;
   private int id;
   //沒有任何參數 稱預設建構式
   public Test1(){
       System.out.println("Test1()");              
   }
   //this. 目前這個物件(Object)
   //this. 兩作用
   //1 參數名稱跟屬性一樣時 為了指定 屬性 使用this.
   //2 為了提示方便
   public Test1(String name,int id){
       this.name = name;
       this.id = id;              
   }
   public void print(){
       System.out.println(name+":"+id);      
   }
}
