/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20220219.Ch5_2_exception2;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Test1 {
    //throws IOException 可能拋出IOException
    public static void testCatched(int v)throws IOException{
        if (v > 50){            
              throw new IOException("錯誤的資料!"+v);      
        }
    }
}
