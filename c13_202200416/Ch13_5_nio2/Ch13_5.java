/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c13_202200416.Ch13_5_nio2;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch13_5 {

    /**
     * @param args the command line arguments
     */
    //就算路徑不存在 只要字串一樣 java就會判定一樣
    //就算路徑不存在 字串不一樣 java會拋出例外
    public static void main(String[] args) {
        Path path1 =  Paths.get("c:","mydirx",".","test.zip");
        Path path2 =  Paths.get("c:","mydirx","test.zip");
        try{
            boolean b1 = Files.isSameFile(path1, path2);
           System.out.println(b1);
        }catch(IOException ex){
               System.out.println(ex);
        }
    }
    
}
