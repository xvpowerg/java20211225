/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20220219.Ch5_2_exception2;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch5_2 {

    public static void main(String[] args)throws IOException {
        try{
          //  Test1.testCatched(60);
          Test1.testCatched(20);
        }catch(IOException ex){
           System.out.println(ex);
        }
        Test1.testCatched(60);
    }
    
}
