/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20220219.Ch5_5_exception5;
import  ch5_20220219.Ch5_5_exception5.myexception.TestUnCatchedException;
/**
 *
 * @author xvpow
 */
public class Ch5_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
             TestMyException.test1CatchedException(100);     
        }catch(MyCatchedException ex){
            System.out.println(ex);
            //顯示訊息 ch5_20220219.Ch5_5_exception5.MyCatchedException:大於50
        }
        try{
            TestMyException.test2UnCatchedException(10);
        }catch(TestUnCatchedException ex){
            System.out.println(ex);
        }
        
        
        
    }
    
}
