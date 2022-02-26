/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20220226.ch6_7.abstract_class1;

/**
 *
 * @author xvpow
 */
//abstract class 不可new
//abstract class 不可 final
//abstract method 不可 final
//abstract method 不可 private
public abstract class Animal {
   private String name;
    private int age;
    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    
   public void setName(String name){
       this.name = name;
   }
   public String getName(){
       return name;
   }
   
   public void setAge(int age){
        this.age = age;
   }
   public int getAge(){
       return age;
   }
   
   public abstract void bark();
   
}
