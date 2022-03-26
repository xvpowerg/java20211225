/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20220326.ch10_7_TreeMap1;
import java.util.TreeMap;
public class Ch10_7 {

    public static void main(String[] args) {
          TreeMap<Integer,String> map = new TreeMap();  
          map.put(25, "Ken");
          map.put(83, "Ken");
          map.put(18, "Lucy");
          map.put(65, "Iris");
          map.put(12, "Vivin");
          map.forEach((k,v)->System.out.println(k+":"+v));
          
          int floor1 = map.floorKey(20);//n <= 20
          int lower1 = map.lowerKey(20);//n < 20
         System.out.println(floor1);
         System.out.println(lower1);
           floor1 = map.floorKey(18);//n <= 18
           lower1 = map.lowerKey(18);//n < 18
         System.out.println(floor1);
         System.out.println(lower1);   
         
          int ceiling1 = map.ceilingKey(20);
          int higher1 = map.higherKey(20);
          System.out.println(ceiling1);
          System.out.println(higher1);
          
          ceiling1 = map.ceilingKey(25);//n>=25
          higher1 = map.higherKey(25);//n>25
          System.out.println(ceiling1);
          System.out.println(higher1);
          Integer higher2 = map.higherKey(9000);//n>25
          System.out.println(higher2);   //找不到回傳null
    }
    
}
