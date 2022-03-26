/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20220326.ch10_4_map3;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author xvpow
 */
public class Ch10_4 {
     public static void main(String[] args) {
         Map<String,Integer> map = new HashMap();
         map.put("Ken", 100);
         map.put("Iris", 75);
         map.put("Lucy", 93);
         map.put("Viivn", 82);
         map.put("Lindy", 95);
         System.out.println(map);
         //key存在 可選擇新舊value的計算
         map.merge("Iris", 30, (v1,v2)->{
                    System.out.println(v1);
                    System.out.println(v2);
                    return v1 + v2;
         });
         System.out.println("============================");
         System.out.println(map);   
          //key不存在 寫入新值
         map.merge("Ben", 77, (v1,v2)->{
         System.out.println(v1+":"+v2);
         return v1+v2;
         });
               System.out.println(map);   
          System.out.println("============================");
         
     }
}
