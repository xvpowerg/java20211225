/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3_20220115.ch3_15_oo4_inherit;

/**
 *
 * @author xvpow
 */
public class Dog  extends Animal{
      Dog(){
          this("Empty",0,0);
      }
      Dog(String name,int age,float weight){
          //super() 呼叫 父類別的建構式
          //super()必須是第一條命令
          super(name,age,weight);
//              setName(name);
//              setAge(age);
//              setWeight(weight);
              }
}
