/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20220312.ch8_1_lambda2;

/**
 *
 * @author xvpow
 */
public class Ch8_1 {
        private static void  myMethodT1(){
            System.out.println("myMethodT1 Hello!");
        }
    public static void main(String[] args) {
        // TODO code application logic here
        Test1IF t1 = ()->{
          System.out.println("Hello!");
        };
        t1.test1();
        Test1IF t2 = () -> System.out.println("T2 Hello!");
        t2.test1();
         Test1IF t3 = Ch8_1::myMethodT1;
        t3.test1();
    }
    
}
