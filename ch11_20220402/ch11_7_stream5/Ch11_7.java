/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20220402.ch11_7_stream5;

/**
 *
 * @author xvpow
 */
public class Ch11_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Student st1 = new Student("Ken",10);
      System.out.println(st1);
      System.out.println(st1.nameLen());  
      
      Student st2 = new Student(null,10);
        System.out.println(st2);
      System.out.println(st2.nameLen());
      
      
        
    }
    
}
