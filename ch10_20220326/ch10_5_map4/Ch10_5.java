/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20220326.ch10_5_map4;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author xvpow
 */
public class Ch10_5 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap();
         map.put("Ken", 100);
         map.put("Iris", 75);
         map.put("Lucy", 93);
         map.put("Viivn", 82);
         map.put("Lindy", 95);
         System.out.println(map);        
         //kye存在compute 會執行function 回傳值會覆蓋舊值
        map.compute("Lucy",(v,k)->{
                    System.out.println(k+":"+v);
                    return 36;
        });
        System.out.println(map);
        System.out.println("====================================");
          //kye存在computeIfAbsent 不會執行function
        map.computeIfAbsent("Viivn", (k)->{
            System.out.println("computeIfAbsent:"+k);
            return 77;
        });
        System.out.println(map);
        System.out.println("====================================");
       map.computeIfPresent("Lindy", (k,v)->{
                  System.out.println(k+":"+v);
       return v+20;
       });
      System.out.println(map);
        System.out.println("====================================");    
    }
    
}
