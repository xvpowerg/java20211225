/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c13_202200416.Ch13_1_serialization1;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch13_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("C:\\mydir\\names.obj");
        try(FileInputStream fIn = new FileInputStream(file);
            ObjectInputStream objIn = new ObjectInputStream(fIn); ){
            ArrayList<String> list = (ArrayList) objIn.readObject();
            System.out.println(list);
        }catch(IOException | ClassNotFoundException ex){
          System.out.println(ex);    
        }
    }
    
}
