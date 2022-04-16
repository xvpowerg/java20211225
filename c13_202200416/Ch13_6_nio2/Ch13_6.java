/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c13_202200416.Ch13_6_nio2;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.stream.Stream;
/**
 *
 * @author xvpow
 */
public class Ch13_6 {

    public static void main(String[] args) {
        Path p1 = Paths.get("c:", "mydir","dir");
//        try{
//           Stream<Path> st =  Files.list(p1);
//           st.forEach(p->System.out.println(p));
//        }catch(IOException ex){
//            System.out.println(ex);
//        }
        //max 最大2147483647
        try{
           Stream<Path> st =  Files.walk(p1, 4);
           st.forEach(p->System.out.println(p));
        }catch(IOException ex){
              System.out.println(ex);
         }
        
        
    }
    
}
