/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20220312.ch8_7_functional_2;
import java.util.function.Supplier;
/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int age;
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    
    public void send(Supplier<? extends Exception> sp)throws Exception{
        if (age < 10){
            throw sp.get();
        }
        System.out.println("送出完成!");
    }
    public String toString(){
        return name+":"+age;
    }
}
