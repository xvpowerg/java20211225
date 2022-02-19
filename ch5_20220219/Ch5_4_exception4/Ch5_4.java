/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20220219.Ch5_4_exception4;
import java.sql.SQLException;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch5_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //越下越父
        try{
              //Test3.testExceptions(601);
              Test3.testExceptions(201);
        }catch(SQLException ex){
            System.out.println(ex);
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }catch(IllegalStateException ex){
              System.out.println(ex);
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        
        
        try{
            Test3.testExceptions(301);  
            //加一組java.io.FileNotFoundException
        }catch(FileNotFoundException ex){
            System.out.println("FileNotFoundException:"+ex);
        }catch(IOException ex){
            System.out.println("IOException:"+ex);
        }catch(Exception ex){
            System.out.println("Exception:"+ex);
        }
     
    }
    
}
