/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20220326.ch10_2_map1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
/**
 *
 * @author xvpow
 */
public class Ch10_2 {
      public static void main(String[] args) {
         Map<String,Integer> map = new HashMap();
         map.put("Ken", 100);
         map.put("Iris", 75);
         map.put("Lucy", 93);
         map.put("Viivn", 82);
         map.put("Lindy", 95);
         map.put("Viivn", 63);//key相同會覆蓋
         int v1 = map.get("Viivn");
         System.out.println(v1);
         
       Set<String> keySet = map.keySet();
//         Iterator<String> keyIt =   keySet.iterator();
//         while(keyIt.hasNext()){
//             System.out.println(keyIt.next());
//         }          
        for (String k : keySet){
              System.out.println(k+":"+map.get(k));
        }
        System.out.println("======================");
        Set<Entry<String,Integer>> entrySet = map.entrySet();
        for(Entry<String,Integer> e :entrySet ){
            System.out.println(e.getKey()+":"+e.getValue());
        }
        System.out.println("======================");
        map.forEach((k,v)->System.out.println(k+":"+v));
      }
}

