/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20220305.Ch7_8_anonymous_class;

import ch7_20220305.Ch7_7_InnerClass1.Ch7_7;
import java.util.function.BiConsumer;
public class Ch7_8 {
    static class MyDog extends Dog{
        public void bark(){
            System.out.println("Dog:喵喵");
        }
    }
    static class MyCat  extends Cat{
        public void bark(){
            System.out.println("Cat:汪汪!");
        }
    }
    
      public static void main(String[] args) {
          //使用於介面
          Ch7_7.printArraysAndIndex(new BiConsumer<Integer,String>(){          
              public void accept(Integer index,String value){
                  System.out.println("Ch7_8:"+index+":"+value);
              }
          });
          
          
          Dog dog = new Dog();
          dog.bark();
          Dog dog2 = new MyDog();
          dog2.bark();
          
          Cat cat1 = new Cat();
          cat1.bark();
          
           Cat cat2 = new MyCat();
          cat2.bark();
          
          Mouse mouse = new Mouse();
          mouse.bark();
           Mouse mouse2 = new Mouse(){
               public void bark(){
                   System.out.println("Mouse:喵喵");
               }           
           };
           mouse2.bark();
           
           

      }
}
