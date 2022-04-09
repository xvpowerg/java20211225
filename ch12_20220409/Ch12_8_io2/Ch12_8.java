/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20220409.Ch12_8_io2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
/**
 *
 * @author xvpow
 */
public class Ch12_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     File src = new File("c:\\mydir\\test.zip");    
      File target = new File("c:\\mydir\\copy_test.zip");
      try{
            InputStream fileIn = new BufferedInputStream(new FileInputStream(src));  
            OutputStream fileOut = new BufferedOutputStream(new FileOutputStream(target));
            int data = -1;
            while( (data = fileIn.read()) != -1 ){
                //System.out.println(data);
                fileOut.write(data);
            }
            fileOut.close();
            fileIn.close();
      }catch(FileNotFoundException ex){
          System.out.println(ex);
      }catch(IOException ex){
           System.out.println(ex);
      }
    }
    
}
