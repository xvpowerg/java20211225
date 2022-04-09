/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20220409.Ch12_7_io1;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
/**
 *
 * @author xvpow
 */
public class Ch12_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("C:\\mydir");
        System.out.println(file.exists());
           System.out.println(file.isDirectory());
           System.out.println(file.isFile());
      File file2 = new File("c:\\mydir\\mymsg.txt");    
      System.out.println(file2.exists());
      File target = new File("c:\\mydir\\copy_mymsg.txt");
      try{
            InputStream fileIn = new FileInputStream(file2);  
            OutputStream fileOut = new FileOutputStream(target);
            int data = -1;
            while( (data = fileIn.read()) != -1 ){
                //System.out.println(data);
                fileOut.write(data);
            }
            
      }catch(FileNotFoundException ex){
          System.out.println(ex);
      }catch(IOException ex){
           System.out.println(ex);
      }

      
      
    }
    
}
