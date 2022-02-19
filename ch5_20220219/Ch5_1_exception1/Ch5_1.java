/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20220219.Ch5_1_exception1;

/**
 *
 * @author xvpow
 */
public class Ch5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName("Ken");
        //不會中斷
        //st1.setAge(-25);//限制條件 大於5 小於 200 不然出現錯誤年齡
        //會中斷 Exception會中斷程式
        //  st1.setAgeEx(-25);
        try{
           st1.setAgeEx(-25);//限制條件 大於5 小於 200 不然出現錯誤年齡
           st1.print();
        }catch(IllegalArgumentException ex){              
              System.out.println(ex);
        }
   
       System.out.println("End");
     
    }
    
}

