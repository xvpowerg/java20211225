/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20220219.Ch5_4_exception4;
import java.sql.SQLException;
import java.io.FileNotFoundException;
/**
 *
 * @author xvpow
 */
public class Test3 {
    public static void testExceptions(int v)throws SQLException,FileNotFoundException{
        if (v > 500){
           throw new IllegalStateException("錯誤的參數");
        }else if (v > 400){
           throw new SQLException("v大於400 SQL");
        }else if (v > 300){
          throw new FileNotFoundException("v 大於 300 FileNotFound");  
        }else if(v > 200){
           throw new NullPointerException("v 大於 200 NullPointer ");  
        }
    }
}
