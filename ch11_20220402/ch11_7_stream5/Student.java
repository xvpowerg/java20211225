/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20220402.ch11_7_stream5;
import java.util.Optional;
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
    public int nameLen(){  
        Optional<String> op = Optional.ofNullable(name);          
        return op.orElse("").length();
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return name+":"+age;
                
    }
}
