/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3_20220115.ch3_13_oo2_encapsulation;

/**
 *
 * @author xvpow
 */
public class Student {
    //name 也封裝 條件! 
    //長度度必須大於1 小於 10
    //不可為null
    //錯誤的姓名格式
   private  String name;
    private int age;
    float height;
    
    public void setName(String inName){
        if (inName == null || inName.length() < 1 || inName.length() > 10 ){
            System.out.println("錯誤的姓名!");
            return;
        }
        name = inName;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAge(int inAge){        
        if (inAge < 6 || inAge > 250){
            System.out.println("錯誤的年齡");
            return;
        }
            age = inAge;        
    }
    public int getAge(){
        return age;
    }
     void print(){
         System.out.println(name+":"+age+":"+height);
     }
     
     
}
