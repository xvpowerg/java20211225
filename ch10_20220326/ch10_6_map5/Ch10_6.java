/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20220326.ch10_6_map5;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author xvpow
 */
public class Ch10_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Map<String,Integer> map = new HashMap();
         map.put("Ken", 100);
         map.put("Iris", 75);
         map.put("Lucy", 93);
         map.put("Viivn", 82);
         map.put("Lindy", 95);
         System.out.println(map); 
        //kye不存在compute 會執行function value是null 回傳值 會新增
         map.compute("Joy", (k,v)->{
             //int x = v;//java.lang.NullPointerException
                System.out.println("compute: "+k+":"+v);
         return 10;
         });
        System.out.println(map);    
        System.out.println("====================================");    
        //kye不存在computeIfAbsent 會執行function value是null 回傳值 會新增
        map.computeIfAbsent("Ben",(k)->{
            System.out.println("computeIfAbsent:"+k);
        return 75;
        });
         System.out.println(map);    
        System.out.println("===================================="); 
         //kye不存在computeIfPresent 不會執行function
       map.computeIfPresent("Gigi",(k,v)->{
            System.out.println("computeIfPresent:"+k+":"+v);
            return 0;
       } );
      System.out.println(map);    
      System.out.println("====================================");   
    }
    
}
