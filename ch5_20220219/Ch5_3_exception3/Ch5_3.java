/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20220219.Ch5_3_exception3;
public class Ch5_3 {
    public static void main(String[] args) {
       try{
              Test2.testuncatched(2);
       }catch(IllegalStateException ex){
           System.out.println(ex);
       }
     
    }
    
}
