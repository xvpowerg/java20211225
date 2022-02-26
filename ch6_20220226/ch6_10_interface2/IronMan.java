/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20220226.ch6_10_interface2;

/**
 *
 * @author xvpow
 */
public class IronMan implements IrommanGroup{
       public void flying(){
            System.out.println("IronMan Fly!");
        }
       public int attacking(int action){
           switch(action){
               case 1:
                   return 100;
               case 2:
                   return 200;
               case 3:
                   return 300;
           }
           return 0;
       }
       public int runing(){
           return 100;
       }
}
