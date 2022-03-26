/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20220326.ch10_3_map2;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author xvpow
 */
public class Ch10_3 {

    public static void main(String[] args) {
       
         Map<String,Integer> map = new HashMap();
         String k1 = new String("Lucy");
         map.put("Ken", 100);
         map.put("Iris", 75);
         map.put(k1, 93);
         map.put("Viivn", 82);
         map.put("Lindy", 95);
         //containsKey 判斷key是否存在 如果存在回傳true
         if (!map.containsKey("Viivn")){
             map.put("Viivn", 62);
         }
         map.putIfAbsent("Lindy", 22);
         
         Integer v2 = map.get("Ben");//key不存在取得null
         System.out.println(v2);
         //key不存在取得default數值key存在取得原本的數值
         int v3 = map.getOrDefault("Ben", 100);
         System.out.println(v3);
        System.out.println(map);
        
        map.remove("Iris");
           System.out.println(map);
           
           map.replaceAll((k,ov)->{
               int ans = ov;
               if (!k.equals("Lucy") ){
                  ans += 20;
               }
           return ans;
           });
           System.out.println(map);
    }
    
}
