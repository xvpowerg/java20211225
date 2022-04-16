/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c13_202200416.Ch13_2_serialization2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author xvpow
 */
public class Ch13_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        File file = new File("C:\\mydir\\item.obj");
        Item item1 = new Item(10,"Item1");
                 
        try(FileOutputStream fout = new FileOutputStream(file);
            ObjectOutputStream objOut = new ObjectOutputStream(fout);  ){
            objOut.writeObject(item1);
         }
    }
    
}
