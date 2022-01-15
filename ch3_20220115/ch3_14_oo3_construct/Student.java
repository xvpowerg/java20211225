/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3_20220115.ch3_14_oo3_construct;

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
    //建構式 特點1 名稱跟類別一樣
    //建構式 無回傳值
    public Student(){
        //name = "未設定";    
        //this() 會呼叫當前類別的其他建構式
        //必須是第一條命令        
        this("未設定",0,0);
        System.out.println("Test!");
    }
  
    public Student(String inName,int inAge,float inHeight){
      name = inName;
      age = inAge;
      height = inHeight;
  }  
  
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
