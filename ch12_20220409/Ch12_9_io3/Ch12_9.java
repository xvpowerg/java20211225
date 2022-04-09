/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20220409.Ch12_9_io3;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;
public class Ch12_9 {

    public static void main(String[] args) {
       File file = new File("C:\\mydir\\mymsg.txt");
       try{
           FileReader fr = new FileReader(file);
          // InputStreamReader  fr = new InputStreamReader(new FileInputStream(file));
           int data = -1;
           while( (data = fr.read())!= -1 ){
                System.out.print((char)data);
           }
       }catch(IOException ex){
           System.out.println(ex);
       }
        
    }
    
}
