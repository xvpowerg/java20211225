/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c13_202200416.Ch13_4_nio2;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.StandardCopyOption;
public class Ch13_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Path srcPath =  Paths.get("c:","mydir","test.zip");
     Path targetPath =  Paths.get("c:","mydir","test_copy.zip");
     try{
         //copy 不可使用ATOMIC_MOVE
         //copy 如果target存在會錯誤 必須加上REPLACE_EXISTING可避免錯誤
         Files.copy(srcPath, targetPath,
                 StandardCopyOption.REPLACE_EXISTING);     
     }catch(IOException ex){
         System.out.println(ex);
     }
    }
    
}
