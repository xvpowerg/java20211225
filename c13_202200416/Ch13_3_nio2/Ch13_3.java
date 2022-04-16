/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c13_202200416.Ch13_3_nio2;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class Ch13_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
       Path p1 =  Paths.get("c:", "mydir","names.obj");
       System.out.println(p1);
          Path p2 =  Paths.get("c:", "a","b","c","d");
       System.out.println(p2.getNameCount());
       System.out.println(p2.getRoot());
       System.out.println(p2.subpath(0,2));
        System.out.println(p2.subpath(1,4));//b c d?
        //因為c不是root也要算在名稱內
      Path p3 =  Paths.get("c", "a","b","c","d");     
       System.out.println(p3.subpath(1, 4));
         System.out.println(p3.getNameCount());
         
     Path p4 = Paths.get("c:", "a","b");
     Path p5 = Paths.get("file","img1.png");
     Path p6 =   p4.resolve(p5);
     System.out.println(p6);
     
     Path p7 = Paths.get("c:", "a","b");
     //因為p8有根目錄(root)直接回傳p8的目錄
     Path p8 = Paths.get("d:", "file","img2.png");
     System.out.println(p7.resolve(p8));
     
     Path p9 = Paths.get("c:", "a","b");
     Path p10 = Paths.get("file","img1.png");
     Path p11  = p9.resolveSibling(p10);
     System.out.println(p11);
     
     //根目錄必須一樣
   Path p12 = Paths.get("c:", "e","f","g");  
   Path p13 = Paths.get("c:", "e");  
   //相對路徑
   Path p14 = p12.relativize(p13);
   System.out.println(p14);
   
   Path p15 = Paths.get("c:\\mydir\\.\\dir1\\..\\dir1\\dir1_1\\");
   System.out.println(p15);
   System.out.println(p15.normalize());
    }
    
}
