/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_2022212.ch4_5_constructor_5;

/**
 *
 * @author xvpow
 */
public class Dog  extends Animal{
    public Dog(String name,float height,int age){
        super(name,height,age);        
    }
    public int getAge(){
        if (super.getAge() < 0){
            return 0;
        }
        return super.getAge();
    }
    //複寫Override
    public void print(){        
        System.out.print("dog:");
//        System.out.println(this.getName()+":"+
//                this.getHeight()+":"+this.getAge());
        super.print();//呼叫父類別的方法        
    }
    
}
