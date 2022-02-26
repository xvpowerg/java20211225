/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20220226.ch6_7.abstract_class1;

/**
 *
 * @author xvpow
 */
public class Ch6_7 {

//abstract class 不可new
//abstract class 不可 final
//abstract method 不可 final
//abstract method 不可 private
    public static void main(String[] args) {
        // TODO code application logic here
        Animal dog1 = new  Dog("momo",2);
         dog1.bark();
       Animal cat1 = new Cat("mimi",3);  
       cat1.bark();
         
    
    }
    
}
