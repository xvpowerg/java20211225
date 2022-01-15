/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3_20220115.ch3_15_oo4_inherit;

/**
 *
 * @author xvpow
 */
public class Animal {
    private String name;
    private int age;
    private float weight;
    Animal(){
        
    }
    
    Animal(String inName,int inAge,float inWeight){
        name = inName;
        age = inAge;
        weight = inWeight ;
    }
    public String getName(){
        return name;
    }    
    public void setName(String inName){
        name = inName;
    }    
    public int getAge(){
        return age;
    }    
    public void setAge(int inAge){
        age = inAge;
    }
    public float getWeight(){
        return weight;
    }
    public void setWeight(float inWeight){
        weight = inWeight;
    }    
    public void print(){
        System.out.println(name+":"+age+":"+weight);
    }
}
