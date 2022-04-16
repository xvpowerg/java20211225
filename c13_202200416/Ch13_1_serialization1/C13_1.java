/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c13_202200416.Ch13_1_serialization1;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author xvpow
 */
public class C13_1 {

    public static void main(String[] args) {
       //序列化
       //物件變檔案
        ArrayList<String> list = new ArrayList<>();
       list.add("Howard");
       list.add("Ken");
       list.add("Vivin");
       list.add("Lindy");
       list.add("Joy");
       File file = new File("C:\\mydir\\names.obj");
       try(FileOutputStream fout = new FileOutputStream(file);
           ObjectOutputStream objOut = new ObjectOutputStream(fout)    ){
           objOut.writeObject(list);
       }catch(IOException ex){
           System.out.println(ex);
       }       
       //反序列化
        //檔案變物件
        
    }
    
}
