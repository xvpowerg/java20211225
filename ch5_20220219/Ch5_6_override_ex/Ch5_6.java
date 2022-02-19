/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20220219.Ch5_6_override_ex;

/**
 *
 * @author xvpow
 */
public class Ch5_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        Test1 t2 = new Test2();
        try{
            t2.myMethod();
        }catch(MyException ex){
            
        }
    }
    
}
