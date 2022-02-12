/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_2022212.ch4_5_constructor_5;

/**
 *
 * @author xvpow
 */
public class Animal {
    private String name;
    private float height;
    private int age;
    
    Animal(String name,float height,int age){
        this.name = name;
        this.height = height;
        this.age = age;                
    }
    
    public String getName(){
        return name;
    }
   
    public float getHeight(){
        return this.height;
    }    
    public int getAge(){
        return age;
    }    
    public void print(){
        System.out.println(name+":"+height+":"+getAge());
    }        
}
