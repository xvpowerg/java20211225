/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20220219.Ch5_1_exception1;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int age;
    Student(){
        
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if (age < 5 || age > 200){
            System.out.println("錯誤年齡");
            return;
        }        
        this.age =age;
    }
    
    public void setAgeEx(int age){
        if (age < 5 || age > 200){
            throw new IllegalArgumentException();
        }
        this.age = age;
    }
    public void print(){
        System.out.println(name+":"+age);
    }
}
